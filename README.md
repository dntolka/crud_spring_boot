It is a Hibernate Restful CRUD API Example using dependencies Spring Boot, MySQL, JPA, lombok.


Server Application:
◦ Create an empty database with name: concertCrud
◦ Open the file: concerts/src/main/java/resources/application.properties and
modify the following properties, depending on your MySQL installation. My username and password are below: 
◦ spring.datasource.username=root
◦ spring.datasource.password=root12345
◦ Run the ConcertsApplication.class

In order to test , send curl requests using : http://localhost:9191/"function_in_controller"

For example, 

(GET) http://localhost:9191/concerts
(GET) http://localhost:9191/users
