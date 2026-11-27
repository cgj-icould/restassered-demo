![REST Assured API Tests](https://github.com/cgj-icould/restassured-demo/actions/workflows/main.yml/badge.svg)
# REST Assured API Test Demo
这是一个基于 Java + Maven + REST Assured 构建的接口自动化测试项目。主要用于演示接口测试的框架搭建、用例编写以及通过 GitHub Actions 实现持续集成（CI）。

## 🛠️ 技术栈

*   **编程语言**：Java 11+
*   **构建工具**：Maven
*   **测试框架**：TestNG / JUnit (根据你实际用的填)
*   **接口测试库**：REST Assured
*   **CI/CD**：GitHub Actions

## 📁 项目结构

```text
├── .github/workflows/       # GitHub Actions CI 配置文件 (自动跑测试)
├── src/test/java/com/demo/api # 测试代码目录
│   ├── HttpBinTest.java     # 针对 httpbin.org 的基础请求测试
│   └── OrderDemo.java       # 针对业务订单接口的测试用例
├── .gitignore               # Git 忽略文件配置
├── pom.xml                  # Maven 依赖与构建配置
└── README.md                # 项目说明文档
