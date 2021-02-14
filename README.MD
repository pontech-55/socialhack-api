#PonteColabora


#Some Info
- This project has all the functionality of the PonteColabora API.
- You can find the DB as well, even though the project doesn't require it to work, it has been uploaded only as documentation, so the jury can check it out if they wish. You can find it in src/main/resources
- If you want to make it work in local, you must create an applications.property file on the src/main/resources folder with the following data:
    - spring.datasource.driver-class-name=com.mysql.cj.jdbc.Driver
    - spring.datasource.url=jdbc:mysql://localhost:3306/socialhack
    - spring.datasource.username=
    - spring.datasource.password=

#Requirements
- Mysql
- Java15
- Maven