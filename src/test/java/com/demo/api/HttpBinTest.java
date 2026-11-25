package com.demo.api;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class HttpBinTest {

    @BeforeMethod
    public void beforeRun() {
        RestAssured.baseURI = "https://httpbin.org";
        System.out.println("===== 开始执行一条测试用例 =====");
    }

    @Test(priority = 1)
    public void testGet() {
        Response res = RestAssured.get("/get");
        Assert.assertEquals(res.statusCode(), 200);
        System.out.println("✅ GET 请求成功，状态码：" + res.statusCode());
    }

    @Test(priority = 2)
    public void testPost() {
        String bodyData = "{\"name\":\"test\",\"age\":18}";

        Response res = RestAssured.given()
                .header("Content-Type", "application/json")
                .body(bodyData)
                .post("/post");

        Assert.assertEquals(res.statusCode(), 200);
        System.out.println("✅ POST 请求成功，状态码：" + res.statusCode());
    }

    @AfterMethod
    public void afterRun() {
        System.out.println("===== 当前这条用例执行结束 =====\n");
    }
}