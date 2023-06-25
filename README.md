<h1>spring-boot-flyway</h1>

This project is an implementation of Flyway technology in a Java application, combined with the use of MySQL database and Docker containerization. Flyway is a popular database migration tool that allows seamless management of database schema evolution.<br>
By using Flyway, this project streamlines the database schema migration process, ensuring that changes to the database structure can be managed effortlessly and consistently across different environments. The integration of MySQL with Docker enhances portability and ease of deployment, making it a convenient choice for modern application development.<br>
<h3>Key Features:</h3>
<li><b>Flyway Integration:</b> The project demonstrates how to integrate Flyway into a Java application for smooth and automated database schema migration.<br>
<li><b>MySQL Database:</b> The application utilizes MySQL as the chosen database management system, providing a reliable and scalable solution for data storage.<br>
<li><b>Docker Containerization:</b> The project leverages Docker to encapsulate the MySQL database within a container, simplifying the deployment and setup process.<br>
<li><b>Simplified Development and Testing:</b> With the Dockerized MySQL container, developers can easily set up and manage the database environment for development, testing, and local deployment.<br>

<h3>Steps & Commands</h3>

<li>Dockerize the Mysql database server <code> docker run -p 3306:3306 --name mysqldb -e MYSQL_ROOT_PASSWORD=12345 -d mysql:latest</code><br>
<li>Confirm the docker containers if they are running 

![image](https://github.com/goktugcebe/spring-boot-flyway/assets/114263311/68683423-0626-401e-9995-8858110ea287)

<li>Implement SQL Queries

![image](https://github.com/goktugcebe/spring-boot-flyway/assets/114263311/a4803969-80f2-4b3f-86b6-a054e1d36257)

<li>Run the app and check if all migrations are running

![image](https://github.com/goktugcebe/spring-boot-flyway/assets/114263311/20bf7eb9-22e0-4aef-b812-47ab9891d0ab)

<li>Database created succesfully

![image](https://github.com/goktugcebe/spring-boot-flyway/assets/114263311/65c10955-7151-44a3-b781-2222a661d48e)


<li>As a last step check the flyway_schema_history

![image](https://github.com/goktugcebe/spring-boot-flyway/assets/114263311/4748f85a-f10d-4aa6-b06a-67fc03899925)
