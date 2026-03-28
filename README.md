# 🔐 Login & Logout API (Spring Boot + Docker)

## 📌 Project Overview

This project is a **REST API for User Authentication** built using **Spring Boot**.
It provides basic functionality for **user registration, login, logout, and session management** using **HTTP Session (stateful authentication)**.

The project is also **Dockerized**, allowing easy deployment and setup.

---

## 🚀 Features

* ✅ User Registration
* ✅ User Login
* ✅ Session-based Authentication
* ✅ Logout functionality
* ✅ Profile (session check)
* ✅ Docker support (containerized application)

---

## 🛠️ Tech Stack

* Java 17
* Spring Boot
* Spring Web
* Spring Data JPA
* Spring Security
* MySQL
* Docker

---

## 📂 Project Structure

```
loginlogout
│
├── controller    → API endpoints
├── service       → Business logic
├── repository    → Database operations
├── entity        → Database table (User)
├── dto           → Request/Response classes
├── config        → Security configuration
├── Dockerfile
├── docker-compose.yml
└── pom.xml
```

---

## ⚙️ API Endpoints

### 🔹 Register User

POST `/user/register`

```json
{
  "username": "admin",
  "password": "1234"
}
```

---

### 🔹 Login User

POST `/user/login`

```json
{
  "username": "admin",
  "password": "1234"
}
```

---

### 🔹 Logout User

POST `/user/logout`

---

### 🔹 Get Profile

GET `/user/profile`

---

## 🗄️ Database Configuration

### application.properties

```
spring.datasource.url=jdbc:mysql://localhost:3306/authdb
spring.datasource.username=root
spring.datasource.password=1234

spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
```

---

## 🐳 Docker Setup

### 🔹 Step 1: Build JAR

```bash
.\mvnw.cmd clean package
```

---

### 🔹 Step 2: Build Docker Image

```bash
docker build -t login-app .
```

---

### 🔹 Step 3: Run Container

```bash
docker run -p 8080:8080 login-app
```

---

## 🐳 Docker Compose (Recommended)

### Run App + MySQL together

```bash
docker-compose up --build
```

---

## 🔐 Authentication Flow

1. User registers → stored in MySQL
2. User logs in → session created
3. Session used for authentication
4. Logout → session invalidated

---

## 🧪 Testing

Use **Postman**

* POST `/user/register`
* POST `/user/login`
* GET `/user/profile`
* POST `/user/logout`

---

## ⚠️ Important Notes

* Uses **HTTP Session (stateful authentication)**
* No JWT used (basic implementation)
* Spring Security configured to allow `/user/**` endpoints
* Tests are skipped during build

---

## 📈 Future Improvements

* 🔒 Password encryption (BCrypt)
* 🔑 JWT authentication
* 👥 Role-based authorization
* 🌐 Frontend integration (React/Angular)
* ☁️ Deployment on AWS / Railway

---

## ▶️ How to Run (Without Docker)

1. Clone the repository
2. Configure MySQL
3. Run the application
4. Test using Postman

---

## 👨‍💻 Author

Satish

---
