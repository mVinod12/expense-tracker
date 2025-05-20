 # Expense Tracker - Spring Boot REST API

A backend application to track income and expenses, categorize them, view monthly summaries, and store/load data from a file. This project was built using Java and Spring Boot as part of a coding task.

# Project Description

This is a simple Expense Tracker backend application where users can:

- Add income and expenses
- Choose categories for each transaction (e.g., food, rent, salary, etc.)
- View monthly summaries
- Save/load transaction data from a file

This project was created using Spring Boot and provides RESTful APIs to perform the above actions. It uses an H2 in-memory database for easy setup and testing.

# Features

- Add transactions (income/expense) via REST API
- Categorize transactions (e.g., Salary, Food, Rent, Travel)
- View monthly summary of income and expenses
- H2 in-memory DB support

 # Tech Stack

- Java 17
- Spring Boot
- Spring Data JPA
- H2 Database
- Maven
- Postman (for API testing)



 How to Run the Project

 # Prerequisites:
- Java 17+
- Maven
- Any IDE (IntelliJ, Eclipse, VS Code)

# Steps:

1. Clone the repository:
git clone https://github.com/mVinod12/expense-tracker.git

2. Navigate to the project directory:
  cd expense-tracker

3.Build and run the project:
mvn spring-boot:run



API Base URL: http://localhost:8081/api/transactions

H2 Console: http://localhost:8081/h2-console


