## Spring Boot REST API
A simple REST API project built using Spring Boot and Java. This application demonstrates the basics of backend development using layered architecture with Controller, Service, and Model classes.

### Features
- REST API implementation using Spring Boot
- Fetch product data using GET API
- Layered architecture
- JSON response handling
- Dependency Injection using @Autowired
- Annotation-based configuration

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
