# spring-boot-api-filedb
A Spring Boot H2 Database with JWT Authentication that I created for a job position at ETS Tour.

**The project has the following technologies:**

- Java 8
- Spring Boot 2 (with Spring Security, Spring Web, Spring Data JPA)
- jjwt 0.11.5
- H2 – embedded database
- Maven

You can send requests with **Postman**.


**How to Use**

Run Spring Boot application with command: mvn spring-boot:run

Check H2 database with url: http://localhost:8080/h2-ui (8080 as your port number)

Make sure that "JDBC URL" is set correctly, like this:

![H2_Login_UI](https://github.com/ADenizA/spring-boot-api-filedb/assets/172323000/42068dcc-9cd7-4c00-aadb-9758292b8645)

Click on "Connect"

Since the database is just created, run the following SQL insert statements to add user roles for authentication

![SQL Query for User Roles](https://github.com/ADenizA/spring-boot-api-filedb/assets/172323000/1d263488-d467-4364-9e81-c1ed444c0d5c)

Hit "Run".

For Postman requests, the application has the following APIs:

| **METHODS** | **URL** | **ACTIONS** | **REQUIRED ROLE** |
| --- | --- | --- | --- |
| POST | /api/auth/signup | signup new account | None |
| POST | /api/auth/signin | signin new account | None |
| POST | /api/auth/signout | logout the account | None |
| POST | /api/test/upload | upload a File | User, Mod or Admin |
| GET | /api/test/files | get List of Files (name, url, type, size) | Mod or Admin |
| GET | /api/test/files/[fileId] | get byte array of a file | User, Mod or Admin |
| DELETE | /api/test/files/[fileId] | delete a file | Mod or Admin |
| GET | /api/test/all | To test jwt authentication | None |
| GET | /api/test/user | To test jwt authentication | User, Mod or Admin |
| GET | /api/test/mod | To test jwt authentication | Mod or Admin |
| GET | /api/test/admin | To test jwt authentication | Admin |


**File Upload Restrictions:**

Max File Size: 5 MB

Allowed File Types: png, jpeg, jpg, docx, pdf, xlsx


**How to Sign-Up**

Write a raw(JSON) body with this format and hit send:

![Signing Up](https://github.com/ADenizA/spring-boot-api-filedb/assets/172323000/7f51e041-37c0-4f84-8daa-d84c859b5a1c)

Example:

![Sign Up Example](https://github.com/ADenizA/spring-boot-api-filedb/assets/172323000/a314d914-a094-45de-b1cd-28c1250428b1)


**How to Sign-In**

Write a raw(JSON) body with this format and hit send:

![image](https://github.com/ADenizA/spring-boot-api-filedb/assets/172323000/b4356e8e-7005-4b89-a046-e2d09872d6a1)

Example:

![image](https://github.com/ADenizA/spring-boot-api-filedb/assets/172323000/df923452-ace9-42a3-82f8-c986d8d7ac33)


**Example File Upload**

![image](https://github.com/ADenizA/spring-boot-api-filedb/assets/172323000/684690ea-b738-4b52-9bde-f609fd88f0b0)


**How to get [fileId] for Deletion and Download**

Use GET /api/test/files to see the file url. Last part of the file url is the [fileId].

![image](https://github.com/ADenizA/spring-boot-api-filedb/assets/172323000/f34e5791-19c4-43df-bb58-cfbf5cdd2d63)

**Example Delete Operation Using the [fileId]**

![image](https://github.com/ADenizA/spring-boot-api-filedb/assets/172323000/65e6f849-09a9-4c20-8222-1ca82c7d3a96)
