package com.demo.api;

import org.testng.Assert;
import org.testng.annotations.*;

public class OrderDemo {

    @BeforeSuite
    public void beforeSuite() {
        System.out.println("👉 @BeforeSuite：整套套件开始");
    }

    @AfterSuite
    public void afterSuite() {
        System.out.println("👉 @AfterSuite：整套套件结束");
    }

    @BeforeClass
    public void beforeClass() {
        System.out.println("👉 @BeforeClass：当前类开始");
    }

    @AfterClass
    public void afterClass() {
        System.out.println("👉 @AfterClass：当前类结束");
    }

    @BeforeMethod
    public void beforeMethod() {
        System.out.println("👉 @BeforeMethod：单条用例开始");
    }

    @AfterMethod
    public void afterMethod() {
        System.out.println("👉 @AfterMethod：单条用例结束");
    }

    @Test(priority = 1)
    public void testOne() {
        System.out.println("✅ testOne 执行");
        Assert.assertEquals(2,2);
    }

    @Test(priority = 2)
    public void testTwo() {
        System.out.println("✅ testTwo 执行");
        Assert.assertEquals(3,3);
    }
}
