# JUnit 操作教學

JUnit 操作教學([參照](https://github.com/junit-team/junit5-samples/blob/main/junit5-jupiter-starter-maven/pom.xml))
---

## JUnit 介紹
:::info
JUnit 5 = JUnit Platform + JUnit Jupiter + JUnit Vintage
:::

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

![image](https://github.com/TommyWU-0416/mockitotest/assets/49664867/1642c433-a56d-4106-9af5-c2daa5b0c242)

### 3. 一般測試情境([官網](https://github.com/junit-team/junit5-samples/tree/HEAD/junit5-jupiter-starter-maven))

#### `@Disable 使用`([CalculatorDisableTest.java](src%2Ftest%2Fjava%2Fguide%2Fexample%2FCalculatorDisableTest.java))
當使用該註解會停用該方法測試
![image](https://github.com/TommyWU-0416/mockitotest/assets/49664867/cf892cda-dafc-47eb-8d55-ce534cea0702)

#### `@RepeatedTest 使用`([CalculatorRepeatedTest.java](src%2Ftest%2Fjava%2Fguide%2Fexample%2FCalculatorRepeatedTest.java))
可重複執行Test
有以下幾種命名方式，先來看 `@RepeatedTest` 實作內容

![image](https://github.com/TommyWU-0416/mockitotest/assets/49664867/9fae8ee5-ae07-47c1-8c20-6bb60af13d03)

看不懂怎麼用，就來看下面範例
```java=
// 指定重複次數，不指定名稱，此時會去找 default
@RepeatedTest(3)

// 使用 @DisplayName 自定義測試名稱，透過這樣的方式可以指定 {displayName}
// 內建提供 {currentRepetition} {totalRepetitions} 可拿來使用
@DisplayName("自定義名稱")
@RepeatedTest(value = 2, name = "{displayName} 第 {currentRepetition} 次 總共 {totalRepetitions} 次")

// 內建提供 LONG_DISPLAY_NAME 字串可用
@DisplayName("預設名稱重複測試")
@RepeatedTest(value = 2, name = RepeatedTest.LONG_DISPLAY_NAME)
```
![image](https://github.com/TommyWU-0416/mockitotest/assets/49664867/7d64695b-2606-473f-bad2-1321b9ab6e4e)

### 4. 一般測試情境([參考](https://kucw.github.io/blog/2020/2/spring-unit-test-mockito/))
