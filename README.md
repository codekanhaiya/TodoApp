# ✅ Todo App (Backend API)

A simple **Todo Application Backend** built with **Java Spring Boot**, **Hibernate**, **JPA**, and **MySQL**, deployed on **Railway**.  
This app provides REST APIs to manage todo tasks. Currently, it exposes an endpoint to fetch all tasks.

---

## 🚀 Features
- Built with **Spring Boot** (Java)
- **Hibernate + JPA** for database ORM
- **MySQL** for data persistence
- Hosted on **Railway**
- Provides RESTful API endpoints

---

## 📡 API Endpoint

### Get All Todos
- **URL:**  
  [`https://todoapp-production-1b18.up.railway.app/todos/getall`](https://todoapp-production-1b18.up.railway.app/todos/getall)

- **Method:**  
  `GET`

- **Response Example:**
```json
[
  {
    "id": 1,
    "title": "Complete README file",
    "completed": false
  },
  {
    "id": 2,
    "title": "Learn Spring Boot",
    "completed": true
  }
]
```

## 🛠️ Tech Stack

- Backend Framework: Spring Boot
- Database: MySQL
- ORM: Hibernate + JPA
- Hosting: Railway
---

## ⚙️ Installation (Local Setup)
### 1. Clone the repository:
```
git clone https://github.com/codekanhaiya/TodoApp.git
cd todo-app-backend
```
### 2. Configure your MySQL database in application.properties:
```
spring.datasource.url=jdbc:mysql://localhost:3306/todo_db
spring.datasource.username=your_mysql_username
spring.datasource.password=your_mysql_password
spring.jpa.hibernate.ddl-auto=update
```

### 3. Build and run the app:
```
./mvnw spring-boot:run
```
### 4. Access API at:
```
http://localhost:8080/todos/getall
```
---


## 🚀 Live Demo

The project is deployed on **Railway** for quick access and testing:  
🔗 [Live API](https://todoapp-production-1b18.up.railway.app/todos/getall)


---
## 👨‍💻 Author

Developed by **Kanhaiya Gupta** ✨
