/***********************/
/******* Read Me *******/
/***********************/

/**************************/
/****** Prerequisites *****/
/**************************/

1. Servlet Container: Apache Tomcat 7  (http://tomcat.apache.org/download-70.cgi)
2. Build Tool: Gradle
3. Database: Mysql (http://www.apachefriends.org/en/xampp-windows.html)



*** How to run : ***
1. modify the db.properties file with your own database credentials.
2. modify the build.properties file with your tomcat installation directory.
3. modify the log4j.properties file and set "log4j.appender.file.File" attribute to your preferred log file location.
4. create a table in your mysql database with dbscript.sql.
5. to build the project open the terminal, go to your project home and run the command "gradle clean build"
