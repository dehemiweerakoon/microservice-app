# Microservices Project: API Gateway, Service Registry, School Service, Student Service

## 📖 About

This project demonstrates a microservice architecture using Spring Boot 3 and Spring Cloud 2025.0.x (Northfields Release Train).  
It contains:

- **API Gateway**: Routes requests to backend services.
- **Eureka Server (Service Registry)**: For service discovery.
- **School Service**: Exposes APIs related to school data.
- **Student Service**: Exposes APIs related to student data.

Each service is an independent Spring Boot application.

---

## 🛠️ Technologies Used

- Java 17
- Spring Boot 3.x
- Spring Cloud 2025.0.x (Northfields)
- Spring Cloud Gateway
- Spring Cloud Netflix Eureka Server/Client
- Maven

---


---

## ⚙️ How to Run

### 1. Prerequisites

- JDK 17+
- Maven 3.x
- IDE (IntelliJ, Eclipse, etc.)

### 2. Start Services in Order

1. **Start Service Registry**  
   Run the `ServiceRegistryApplication` class (`service-registry` module).

2. **Start School Service**  
   Run the `SchoolServiceApplication` class (`school-service` module).

3. **Start Student Service**  
   Run the `StudentServiceApplication` class (`student-service` module).

4. **Start API Gateway**  
   Run the `ApiGatewayApplication` class (`api-gateway` module).

All services should successfully register with Eureka.

---

## ⚡ Application Configuration (example)

### `service-registry/src/main/resources/application.properties`

```properties
      server.port=8761
      spring.application.name=service-registry
      eureka.client.register-with-eureka=false
      eureka.client.fetch-registry=false
```
![image](https://github.com/user-attachments/assets/0c32a818-7a06-4edc-a1cf-ca1e83f6f80d)

