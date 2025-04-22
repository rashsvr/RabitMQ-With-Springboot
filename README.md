# 🐇 RabbitMQ With Spring Boot 🧰

This project demonstrates how to integrate **RabbitMQ** with a **Spring Boot** application. It showcases basic message 📩 publishing and consuming functionalities using RabbitMQ.

---

## ✨ Features

- 📨 **Message Producer** – Sends messages to a RabbitMQ queue  
- 📬 **Message Consumer** – Listens to messages from the queue  
- ⚙️ **Spring Boot Integration** – Simplified setup with Spring Boot

---

## 🛠️ Prerequisites

- ☕ Java 11 or higher  
- 🐰 RabbitMQ (local or cloud)  
- 📦 Maven (for dependency management)

---

## ⚙️ Configure RabbitMQ

1. 🧪 **Install RabbitMQ** – Follow the [official docs](https://www.rabbitmq.com/download.html)  
2. ▶️ **Start RabbitMQ Server** – Run it using the appropriate command for your OS

---

## 📦 Add Dependencies

In your `pom.xml`, include the following:

```xml
<dependency>
    <groupId>org.springframework.boot</groupId>
    <artifactId>spring-boot-starter-amqp</artifactId>
</dependency>
```

---

## 🚀 Running the Application

1. 🧹 **Build the Project**

```bash
mvn clean install
```

2. ▶️ **Run the Application**

```bash
mvn spring-boot:run
```

---

## 📤 Sending Messages

Use Postman or curl to send messages:

```bash
curl --header "Content-Type: application/json" \
  --request POST \
  --data '{"message":"Hello, RabbitMQ!"}' \
  http://localhost:8080/send
```

---

## 📄 License

Licensed under the [MIT License](https://opensource.org/licenses/MIT) 📘

---

Happy coding! 💻✨  
🔗 [Visit the repo](https://github.com/rashsvr/RabitMQ-With-Springboot)

---
