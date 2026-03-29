# 🔐 Login & Logout API

### 🚀 Spring Boot • MySQL • Docker • Session-Based Auth

<p align="center">
  <b>A production-ready authentication API using Spring Boot with Docker support</b>
</p>

---

## 📌 Overview

This project is a **RESTful Authentication API** built with **Spring Boot** that provides secure user management using **HTTP Session (stateful authentication)**.

It supports **user registration, login, logout, and session tracking**, and is fully **Dockerized** for easy deployment.

---

## ✨ Features

* 🔐 User Registration & Login
* 🧠 Session-Based Authentication
* 🚪 Logout (Session Invalidation)
* 👤 Profile Access (Session Validation)
* 🐳 Dockerized Application
* ⚡ Clean Layered Architecture

---

## 🛠️ Tech Stack

| Technology      | Usage             |
| --------------- | ----------------- |
| Java 17         | Core Language     |
| Spring Boot     | Backend Framework |
| Spring Security | Authentication    |
| Spring Data JPA | ORM               |
| MySQL           | Database          |
| Docker          | Containerization  |

---

## 📂 Project Structure

```
loginlogout/
├── controller     → API endpoints
├── service        → Business logic
├── repository     → DB access
├── entity         → User model
├── dto            → Request/Response objects
├── config         → Security config
├── Dockerfile
├── docker-compose.yml
└── pom.xml
```

---

## ⚙️ API Endpoints

| Method | Endpoint         | Description        |
| ------ | ---------------- | ------------------ |
| POST   | `/user/register` | Register user      |
| POST   | `/user/login`    | Login user         |
| POST   | `/user/logout`   | Logout user        |
| GET    | `/user/profile`  | Get logged-in user |

---

### 📥 Sample Request

```json
{
  "username": "admin",
  "password": "1234"
}
```

---

## 🗄️ Database Setup

> ⚠️ **Each user must configure their own database**

```
spring.datasource.url=jdbc:mysql://localhost:3306/your_db_name
spring.datasource.username=your_username
spring.datasource.password=your_password
```

### 🛑 Note

* No shared database access is provided
* You must use your own local MySQL instance

---

## 🐳 Docker Setup

### 🔹 Build JAR

```bash
.\mvnw.cmd clean package
```

### 🔹 Build Image

```bash
docker build -t login-app .
```

### 🔹 Run Container

```bash
docker run -p 8080:8080 login-app
```

---

## 🐳 Docker Compose (Recommended)

Run full setup (App + MySQL):

```bash
docker-compose up --build
```

---

## 🔐 Authentication Flow

```
Register → Login → Session Created → Access APIs → Logout → Session Destroyed
```

---

## 🧪 API Testing

Use Postman:

* POST `/user/register`
* POST `/user/login`
* GET `/user/profile`
* POST `/user/logout`

---

## ⚠️ Important Notes

* Uses **HTTP Session (Stateful Authentication)**
* No JWT (beginner-friendly implementation)
* Spring Security configured for `/user/**`
* Tests are skipped during build

---

## 📈 Future Enhancements

* 🔒 Password Encryption (BCrypt)
* 🔑 JWT Authentication
* 👥 Role-Based Authorization
* 🌐 Frontend Integration
* ☁️ Cloud Deployment (AWS / Railway)

---

## ▶️ Run Locally (Without Docker)

```bash
git clone <your-repo-url>
cd loginlogout
.\mvnw.cmd spring-boot:run
```

---

## 👨‍💻 Author

**Satish Dadas**

---

## 📄 License

This project is licensed under the MIT License.

Copyright (c) 2026 Satish 
Permission is hereby granted, free of charge, to any person obtaining a copy of this software and associated documentation files (the "Software"), to deal in the Software without restriction, including without limitation the rights to use, copy, modify, merge, publish, distribute, sublicense, and/or sell copies of the Software, and to permit persons to whom the Software is furnished to do so, subject to the following conditions: The above copyright notice and this permission notice shall be included in all copies or substantial portions of the Software.
