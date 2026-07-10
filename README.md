# Hero Cycle Pricing Engine

## Overview

Hero Cycle Pricing Engine is a full-stack web application developed to simplify the management of bicycle components and pricing configurations. The application allows users to manage bicycle components, maintain pricing information, and calculate the total price of different bicycle configurations. It is designed using a layered architecture with a React frontend and a Spring Boot backend.

## Technology Stack

### Frontend

* React.js
* React Router DOM
* Axios
* Bootstrap

### Backend

* Java 21
* Spring Boot
* Spring Data JPA (Hibernate)
* Maven
* Swagger OpenAPI

### Database

* MySQL

---

## Project Architecture

```text
React Frontend
       │
       │ HTTP (REST API)
       ▼
Spring Boot Backend
       │
       ▼
Service Layer
       │
       ▼
Repository Layer
       │
       ▼
MySQL Database
```

---

## Features

### Completed

* Add Component
* View Components
* Update Component
* Delete Component
* REST API Integration
* Swagger UI Documentation
* MySQL Database Connectivity

### Planned

* Cycle Configuration Management
* Price Calculation Engine
* Component Price History
* Dashboard Analytics
* User Authentication
* PDF/Excel Export

---

## Backend Structure

```text
src/main/java

controller
entity
repository
service
serviceimpl
config
exception
```

---

## Frontend Structure

```text
src

api
components
pages
services
App.jsx
main.jsx
```

---

## REST APIs

### Component APIs

| Method | Endpoint                   | Description            |
| ------ | -------------------------- | ---------------------- |
| POST   | /api/components            | Add Component          |
| GET    | /api/components            | Get All Components     |
| GET    | /api/components/{id}       | Get Component By ID    |
| PUT    | /api/components/{id}       | Update Component       |
| PATCH  | /api/components/{id}/price | Update Component Price |
| DELETE | /api/components/{id}       | Delete Component       |

---

## Running the Backend

1. Create a MySQL database named:

```sql
CREATE DATABASE pricing_engine;
```

2. Configure the database details in `application.properties`.

3. Run the Spring Boot application.

4. Open Swagger UI:

```
http://localhost:8080/swagger-ui.html
```

---

## Running the Frontend

Install dependencies:

```bash
npm install
```

Run the application:

```bash
npm run dev
```

Frontend URL:

```
http://localhost:5173
```

---

## Current Application Flow

1. User enters component details in the React application.
2. React sends a POST request using Axios.
3. Spring Boot Controller receives the request.
4. Service layer processes the request.
5. Repository saves the data into MySQL.
6. The backend returns a JSON response.
7. React refreshes the table and displays the newly added component.

---

## Sample Component JSON

```json
{
  "name": "Tyre",
  "category": "Wheel",
  "currentPrice": 250,
  "active": true
}
```

---

## Future Enhancements

* Configuration Builder
* Dynamic Price Calculation
* Component Price History
* GST and Discount Support
* Supplier Management
* Dashboard Reports
* Authentication and Authorization
* Export to PDF and Excel

---

## Author

**Prashanth**

B.Tech – Electronics and Communication Engineering

Java Full Stack Developer

**Project:** Hero Price Application

Demo Video: https://drive.google.com/file/d/1gUGt1tS9JJ_GwFU9mAnsFUgM4fH5AhoM/view?usp=sharing

Linkedin: https://www.linkedin.com/in/a-prashanth-6a4280325/
