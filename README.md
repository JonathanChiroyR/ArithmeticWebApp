# ArithmeticWebApp
Arithmetical Web Application - Jonathan Chiroy

This project is a full-stack application developed with Spring Boot on the backend and Angular 19 on the frontend. Below are the steps to properly run the project.

Prerequisites

Make sure you have the following tools installed:

- Git

Backend (Java 21 + Spring Boot)
- Java 21
- Maven (for dependency management and project building)

Recommended IDE: IntelliJ IDEA (I used community edition)

Frontend (Angular 19 + Node.js)
- Node.js v22.14 (Includes npm, necessary for installing Angular dependencies)
- Angular CLI (Tool for running Angular commands)
Install Angular with:
npm install -g @angular/cli@19

1 - Clone Repository
git clone https://github.com/JonathanChiroyR/ArithmeticWebApp.git

2 - Run the Backend
- Navigate to the backend directory:
cd arithmeticOpsBackend

- Install dependencies and build the project:
mvn clean install

- Run the Spring Boot application:
mvn spring-boot:run

3 - Run the Frontend

- Navigate to the frontend directory:
cd arithmeticOpsFrontend

- Install Angular dependencies:
npm install

- Run the Angular application:
ng serve --open

This will automatically open the application in the browser.