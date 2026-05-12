## Spring Boot REST API
A simple REST API project built using Spring Boot and Java. This application demonstrates the basics of backend development using layered architecture with Controller, Service, and Model classes.

### Features
- REST API implementation using Spring Boot
- Fetch product data using GET API
- Layered architecture
- JSON response handling
- Dependency Injection using @Autowired
- Annotation-based configuration
- Store employee data in MySQL database
- Automatic table creation using Hibernate
- Entity mapping using JPA annotations
- Spring Data JPA integration
- MySQL database configuration using application.properties

### CURD Operations
- Get Employees
- Get Employee By ID
- Add Employee
- Update Employee
- Delete Employee
  
### Technologies Used
- Java
- Spring Boot
- REST API
- Maven
- Spring Data JPA
- Hibernate
- MySQL

### Project Structure
```
src/main/java
│
├── Controller
│   └── EmployeeController.java
│
├── Service
│   └── EmployeeService.java
│
├── Model
│   └── Employee.java
```

### API Endpoint
Get All Products
```
GET /emp
```

### Sample Response
```
[
  {
    "id": 101,
    "name": "Mahi",
    "age": 20
  },
  {
    "id": 102,
    "name": "Ammu",
    "age": 21
  },
  {
    "id": 103,
    "name": "Sree",
    "age": 19
  }
]
```

### Learning Outcomes
Through this project, I learned:

- Basics of Spring Boot
- Creating REST APIs
- Using annotations like:
    - @RestController
    - @Service
    - @GetMapping
    - @Autowired
- Returning Java objects as JSON responses
- Organizing code using layered architecture

### Dependencies Used

#### Spring Data JPA

```xml
<dependency>
    <groupId>org.springframework.boot</groupId>
    <artifactId>spring-boot-starter-data-jpa</artifactId>
</dependency>
```

### MySQL Driver

```xml
<dependency>
    <groupId>com.mysql</groupId>
    <artifactId>mysql-connector-j</artifactId>
    <scope>runtime</scope>
</dependency>
```


## Database Configuration

```properties
spring.datasource.driver-class-name=com.mysql.cj.jdbc.Driver

spring.datasource.url=jdbc:mysql://localhost:3306/Spring
spring.datasource.username=root
spring.datasource.password=your_password

spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
```
