
# 🔐 JWT-Auth

> **Empower your applications with unmatched security solutions.**  
> A secure, production-ready authentication module for Spring Boot + React apps.

![Last Commit](https://img.shields.io/github/last-commit/thejaxen/JWT-?style=flat&logo=git&logoColor=white&color=0080ff)
![Top Language](https://img.shields.io/github/languages/top/thejaxen/JWT-?style=flat&color=0080ff)
![Language Count](https://img.shields.io/github/languages/count/thejaxen/JWT-?style=flat&color=0080ff)

---

## 🧩 Built With

- ![Java](https://img.shields.io/badge/Java-ED8B00?style=flat&logo=java&logoColor=white)
- ![Spring Boot](https://img.shields.io/badge/Spring_Boot-6DB33F?style=flat&logo=spring-boot&logoColor=white)
- ![MySQL](https://img.shields.io/badge/MySQL-4479A1?style=flat&logo=mysql&logoColor=white)
- ![React](https://img.shields.io/badge/React-61DAFB?style=flat&logo=react&logoColor=black)
- ![YAML](https://img.shields.io/badge/YAML-CB171E?style=flat&logo=YAML&logoColor=white)
- ![XML](https://img.shields.io/badge/XML-005FAD?style=flat&logo=xml&logoColor=white)

---

## 📌 Features

- 🔐 JWT-based Authentication & Authorization
- ✅ Secure registration & login endpoints
- 📁 Role-based access control (Admin/User)
- ⚙️ Configurable via `application.yml`
- 🧪 Unit & integration tests with JUnit + MockMvc
- 🚀 Ready for CI/CD and containerization

---

## 📂 Project Structure

```
jwt-auth/
├── backend/
│   ├── src/main/java/com/example/jwt/
│   └── src/main/resources/application.yml
├── frontend/
│   ├── src/
│   └── public/
└── README.md
```

---

## 🚀 Getting Started

### 🛠 Prerequisites

- Java 17+
- Node.js & npm
- MySQL
- Maven

### ⚙️ Backend Setup

```bash
cd backend
mvn clean install
mvn spring-boot:run
```

### 💻 Frontend Setup

```bash
cd frontend
npm install
npm start
```

> Make sure your backend runs at `http://localhost:8080` and frontend at `http://localhost:3000`.

---

## 🧪 Testing

```bash
mvn test
```

Includes:
- Controller tests (MockMvc)
- Service layer tests
- Auth validation tests

---

## 🔒 API Endpoints (Sample)

| Method | Endpoint            | Description         |
|--------|---------------------|---------------------|
| POST   | `/api/auth/login`   | Login with JWT      |
| POST   | `/api/auth/register`| Register new user   |
| GET    | `/api/users/me`     | Authenticated info  |

---

## 📜 License

This project is licensed under the [MIT License](LICENSE).

---

## 🙌 Acknowledgements

- [Spring Security](https://spring.io/projects/spring-security)
- [React](https://reactjs.org/)
- [Auth0 JWT](https://github.com/auth0/java-jwt)

---

## 📫 Contact

**Mert Duyar** – [LinkedIn](https://linkedin.com/in/mert-duyar/) – mertysfduyar@gmail.com  
[GitHub Profile](https://github.com/thejaxen)

---

> Star ⭐ the repo if you like it, and feel free to contribute!
