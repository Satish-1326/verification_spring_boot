# 🔐 Login & Logout API (Spring Boot)

## 📌 Project Overview

This project is a simple **Login & Logout REST API** built using **Spring Boot**.
It demonstrates user authentication using **HTTP Session (stateful authentication)** without JWT.

---

## 🚀 Features

* ✅ User Registration
* ✅ User Login
* ✅ Session-based Authentication
* ✅ Logout functionality
* ✅ Profile check (session validation)

---

## 🛠️ Tech Stack

* Java (Spring Boot)
* Spring Web
* Spring Data JPA
* MySQL Database
* Spring Security (basic configuration)

---

## 📂 Project Structure

```
com.loginlogout
│
├── controller    → API endpoints
├── service       → Business logic
├── repository    → Database operations
├── entity        → Database table (User)
├── dto           → Request objects
├── config        → Security configuration
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
```

---

### Table Structure

```
Table: login

id (INT, PK)
username (VARCHAR)
password (VARCHAR)
```

---

## 🔐 Authentication Flow

1. User registers → data stored in database
2. User logs in → session is created
3. Session is used to access protected API
4. Logout → session invalidated

---

## ▶️ How to Run

1. Clone the repository
2. Open in IntelliJ / Eclipse
3. Configure MySQL database
4. Run the Spring Boot application
5. Test APIs using Postman

---

## 🧪 Testing

Use Postman to test APIs:

* POST `/user/register`
* POST `/user/login`
* GET `/user/profile`
* POST `/user/logout`

---

## 📌 Important Notes

* This project uses **session-based authentication**
* No JWT used (simple implementation)
* Spring Security is configured to allow `/user/**` endpoints

---

## 📈 Future Improvements

* Add password encryption (BCrypt)
* Implement JWT authentication
* Add role-based authorization
* Build frontend UI

---

## 👨‍💻 Author

Satish dadas

---
