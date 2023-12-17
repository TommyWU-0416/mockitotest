# JUnit 操作教學

JUnit 操作教學([參照](https://github.com/junit-team/junit5-samples/blob/main/junit5-jupiter-starter-maven/pom.xml))
---

## JUnit 5 的使用
### 1. 前置作業準備
* JDK 17
* spring-boot-starter-parent 3.2.0
* junit-jupiter 5.10.1

### 2. 開始建置專案([參考](https://kucw.github.io/blog/2020/2/spring-unit-test-mockito/))
專案結構如下(由於檔案比較少所以就不分層分種類)
* User PO使用
* UserDao 跟資料庫拿取資料用，但先假設還沒有寫完固定回傳資料
* UserService 當作服務使用
* UserServiceTest 一般測試使用
* UserServiceTestWithMockito mockito測試使用

![image](https://hackmd.io/_uploads/rJFnpQ3Lp.png)
