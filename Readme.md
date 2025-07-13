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

## 🌐 Live Demo

You can also try it at this link:  
👉 **[http://43.165.197.160:8088/](http://43.165.197.160:8088/)**

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
git clone https://github.com/Alhuzsyam/tictactoe-thymeleaf-Java-.git
cd tictactoe-thymeleaf-Java- 

# Build and run the application
./mvnw spring-boot:run

Visit http://localhost:8088 on your browser.


🖥️ Usage
You can choose a board size (3 or more) on the home page.

Click Start New Game to reinitialize the board.

Input the coordinates of the cell (row, col) to make a move.

The game will detect if a player wins or the game ends in a draw.


