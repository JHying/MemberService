# Introduction

1. 開發環境：Eclipse

2. 專案建置：Maven 3.8.2

3. 語言版本：JAVA JDK 8

4. 執行：jar as service

5. 框架：spring boot 2.5.5

6. ORM：Spring Data JPA 2.5.5 (含 hibernate 5.4.32.Final)

7. Log：spring-boot-starter-logging 2.5.5 （含 logback 1.2.6）

8. 測試範例：

	API 1（測試用 API）：
	
	[GET] /member/test --> return 測試成功 --> HttpStatus.OK
						
	API 2（取得使用者資料）：
	
	[GET] /member/get/{uid} --> 取得使用者資料 --- (有該使用者) --> HttpStatus.OK
										|
										|
										-- --- -- (找不到使用者) --> return null --> HttpStatus.OK		
										
	API 3（統一處理 exception 測試）：
	
	[GET] /test/error --> return (HTTP 500) 統一處理 exception. --> HttpStatus.INTERNAL_SERVER_ERROR								
		
### Detail

1. 設定檔位置：src.main.resources

2. 使用 maven build

3. 包含兩種環境配置：dev & prod

4. 可依據 maven build 參數決定要 build 的檔案（dev 配置檔放在 dev 資料夾，prod 配置檔放在 prod 資料夾）

5. logback-test.xml：log 配置檔－－分別產生 INFO 及 ERROR 資訊的 Log 檔
