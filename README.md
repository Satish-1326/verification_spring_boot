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
spring.datasource.url=jdbc:mysql://localhost:3306/your_DB
spring.datasource.username=your_username
spring.datasource.password=your_pass

spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
```

## 🗄️ Database Schema

### 📋 Table: `login`

```sql
CREATE TABLE login (
    id INT AUTO_INCREMENT PRIMARY KEY,
    username VARCHAR(50) NOT NULL,
    password VARCHAR(100) NOT NULL
);
```

---

### 🔹 Sample Data

```sql
INSERT INTO login (username, password) VALUES ('admin', '1234');
```

---

### 🔍 View Data

```sql
SELECT * FROM login;
```

---

### ⚠️ Notes

* Table name must be: `login`
* Column names must match:

  * `id`
  * `username`
  * `password`
* Ensure your entity is mapped correctly:

```java
@Table(name = "login")
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

## 📈 Future Improvements (Comming Soon ... Just Wait And Watch)

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

Satish Dadas

MIT License

Copyright (c) 2026 Satish

Permission is hereby granted, free of charge, to any person obtaining a copy
of this software and associated documentation files (the "Software"), to deal
in the Software without restriction, including without limitation the rights
to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
copies of the Software, and to permit persons to whom the Software is
furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in all
copies or substantial portions of the Software.

---

in this i want to write that every user need to their sql db not giving permission to use my 
