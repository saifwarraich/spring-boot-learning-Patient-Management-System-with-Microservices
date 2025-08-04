# 🏥 Patient Management System

A **Patient Management System** built with **Spring Boot Microservices Architecture**. Currently implements the core Patient Service with plans to expand into a full microservices ecosystem.

## Current Status

**Implemented:** Patient Service with CRUD operations  
**Planned:** Billing Service (gRPC), Analytics Service (Kafka), Auth Service (JWT), API Gateway

## Architecture

### Current Services

- **Patient Service** – Core patient data management with REST API

### Planned Services

- **Billing Service** – gRPC-based billing operations
- **Analytics Service** – Event-driven analytics with Kafka
- **Auth Service** – JWT authentication & authorization
- **API Gateway** – Central routing and security

## Technology Stack

### Current Implementation

- **Java 17+**
- **Spring Boot 3.x**
- **Spring Data JPA** for data persistence
- **H2/PostgreSQL** for database
- **Maven** for build management

### Planned Technologies

- **Spring Security + JWT** for authentication
- **gRPC** for inter-service communication
- **Apache Kafka** for event streaming
- **Docker** for containerization
- **AWS CloudFormation** for cloud deployment

## Quick Start

### Prerequisites

- **Java 17+** and **Maven 3.8+**

### Run the Patient Service

1. **Clone the repository**

   ```bash
   git clone <repository-url>
   cd patient-management-system
   ```

2. **Run the application**

   ```bash
   cd patient-service
   mvn spring-boot:run
   ```

3. **Access the service**
   - Patient Service: http://localhost:8081
   - H2 Console (if using H2): http://localhost:8081/h2-console

## API Endpoints

### Patient Management

| Method | Endpoint             | Description        |
| ------ | -------------------- | ------------------ |
| GET    | `/api/patients`      | Get all patients   |
| GET    | `/api/patients/{id}` | Get patient by ID  |
| POST   | `/api/patients`      | Create new patient |
| PUT    | `/api/patients/{id}` | Update patient     |
| DELETE | `/api/patients/{id}` | Delete patient     |

### Example Usage

```bash
# Get all patients
curl -X GET http://localhost:8081/api/patients

# Create a new patient
curl -X POST http://localhost:8081/api/patients \
  -H "Content-Type: application/json" \
  -d '{
    "name": "John Doe",
    "email": "john.doe@example.com",
    "phone": "+1234567890",
    "dateOfBirth": "1990-01-01"
  }'
```

## Testing

```bash
# Run tests
mvn clean test

# Run with coverage
mvn clean test jacoco:report
```

## Development Roadmap

### ✅ Phase 1: Core Patient Service (Current)

- [x] Patient entity and repository
- [x] REST API endpoints (CRUD)
- [x] Basic validation and error handling
- [x] Unit and integration tests

### 🔄 Phase 2: Authentication & Security (Next)

- [ ] Auth Service with JWT
- [ ] Spring Security integration
- [ ] Role-based access control

### 📋 Phase 3: Additional Services

- [ ] Billing Service with gRPC
- [ ] Analytics Service with Kafka
- [ ] API Gateway setup

### ☁️ Phase 4: Deployment & Infrastructure

- [ ] Docker containerization
- [ ] AWS CloudFormation templates
- [ ] CI/CD pipeline

## 🎯 Learning Goals

This project demonstrates:

- **Spring Boot** application development
- **RESTful API** design and implementation
- **JPA/Hibernate** for data persistence
- **Test-Driven Development** practices
- **Microservices architecture** planning

---
