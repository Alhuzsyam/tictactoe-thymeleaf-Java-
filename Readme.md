# 🕹️ Tic-Tac-Toe Java Web (Configurable Board)

This is a web-based implementation of the classic Tic-Tac-Toe game built with **Java Spring Boot** using **Thymeleaf** as the template engine.  
It was developed as part of the backend recruitment test for **FWD Singapore**.

---

## 🚀 Features

- ✅ Configurable board size (e.g. 3x3, 5x5, 9x9, etc)
- ✅ Turn-based gameplay between two players (X and O)
- ✅ Win/draw detection with dynamic board logic
- ✅ Clean Object-Oriented design (OOP)
- ✅ Simple web UI using Thymeleaf
- ✅ No hardcoding – flexible logic based on board size

---

## 🧱 Tech Stack

- Java 17
- Spring Boot 3.x
- Thymeleaf
- Maven
- HTML/CSS

---

## 📦 Project Structure

tic-tac-toe/
├── controller/ → Spring MVC controller (GameController)
├── model/ → OOP model classes (Board, Player, Move)
├── service/ → Game logic handler (GameService)
├── resources/
│ └── templates/
│ └── index.html → Web UI
└── TicTacToeApplication.java

---

## ▶️ How to Run

### Prerequisites
- Java 17+
- Maven 3.8+

### Steps

```bash
# Clone the repository
git clone https://github.com/your-username/tic-tac-toe-java.git
cd tic-tac-toe-java

# Build and run the application
./mvnw spring-boot:run

Visit http://localhost:8088 on your browser.

