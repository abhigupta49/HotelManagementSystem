<h1 align = "center"> Hotel Management System </h1>


---
<br>

## Framework Used
* Spring Boot

---
<br>

## Dependencies
The following dependencies are required to run the project:

* Spring Web
* Spring Data JPA
* H2 Database
* Lombok

<br>

## Database Configuration
To connect to a H2 database, update the application.properties file with the appropriate database URL, username, and password. The following properties need to be updated:
```
spring.datasource.url = jdbc:h2:mem:h2db
spring.datasource.driverClassName = org.h2.Driver
spring.datasource.userName = <user name>
spring.datasource.password = <user password>
spring.jpa.database-platform = org.hibernate.dialect.H2Dialect
spring.h2.console.enabled = true


spring.jpa.properties.hibernate.show_sql = true
spring.jpa.properties.hibernate.use_sql_comments=true
spring.jpa.properties.hibernate.format_sql=true

```
<br>

## Language Used
* Java

---
<br>

## Data Model

The HotelRoom data model is defined in the HotelRoom class, which has the following attributes:
<br>

* HotelRoom
```
roomId: The unique identifier for the room.
roomNumber : The room number signifies the particular room.
roomType : The type of the room AC , NON-AC , DELUXE.
roomPrice : The price of the room.
roomStatus : The room status helps to identify the room available or not.

```


## Data Flow

1. The user at client side sends a request to the application through the API endpoints.
2. The API receives the request and sends it to the appropriate controller method.
3. The controller method makes a call to the method in service class.
4. The method in service class builds logic and retrieves or modifies data from the database, which is in turn given to controller class
5. The controller method returns a response to the API.
6. The API sends the response back to the user.

---

<br>

<br>

## DataBase Used
* H2 database
```
We have used In-Memory database to implement CRUD Operations.
```
---
<br>

## Project Summary


The portal provides a complete solution for performing CRUD operations on the HotelRoom model. Users can easily create, read, update, and delete records. Additionally, they have the flexibility to access specific record details, modify attributes of existing records, and remove records from the system. This comprehensive functionality ensures seamless management of the models within the portal.


    
---
