# Jasypt Spring Boot test

使用 Jasypt 對 Spring Boot 設定檔 (.yaml or .properties) 加密

- swagger url：http://localhost:8080/swagger-ui/
- H2 console：http://localhost:8080/h2-console/
- 產生密碼：`java -cp <jasypt*.jar 的路徑> org.jasypt.intf.cli.JasyptPBEStringEncryptionCLI input="密碼" password="密鑰" algorithm=PBEWithMD5AndDES`
- `jasypt.encryptor.password` 在正式環境中必須從設定檔中刪除，可以放在
  - 啟動參數：`-Djasypt.encryptor.password=密鑰`
  - 環境變數