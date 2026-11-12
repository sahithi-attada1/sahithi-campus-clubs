# Campus Club Directory

## CSC311 – Module 8 Lab: Spring Boot

**Student:** Sahithi Attada

## Project Description

Campus Club Directory is a Spring Boot web application that allows users to view and add campus clubs. Club information is stored in an Apache Derby database and accessed through a REST API.

## Technologies Used

- Java 25
- Spring Boot 4.1.1
- Spring Data JPA
- Apache Derby
- HTML, CSS, and JavaScript
- Maven
- IntelliJ IDEA

## Features

- View all campus clubs
- Add new clubs using a web form
- Store club information in an Apache Derby database
- Retrieve clubs through REST API endpoints
- Filter clubs by category
- Retrieve individual clubs by ID
- Validate required fields
- Automatically load three sample clubs when the database is empty

## How to Run

1. Clone or download this repository.
2. Open the project in IntelliJ IDEA.
3. Make sure Java 25 is installed.
4. Allow Maven to download the project dependencies.
5. Run `SahithiCampusClubsApplication.java`.
6. Open `http://localhost:8085` in a browser.

## REST API Endpoints

| Method | Endpoint | Description |
|---|---|---|
| GET | `/api/clubs` | Retrieve all clubs |
| GET | `/api/clubs/{id}` | Retrieve a club by ID |
| GET | `/api/clubs?category=Sports` | Filter clubs by category |
| POST | `/api/clubs` | Add a new club |

## Sample Clubs

The database initially contains three clubs:

- Computer Science Club – Academic – Tuesday – Lupton Hall 120
- Chess Club – Games – Wednesday – Campus Center 205
- Running Club – Sports – Friday – Nold Hall

## Database

The application uses Apache Derby for persistent data storage. Hibernate automatically creates or updates the database tables when the application starts.

## Web Interface

The application includes a webpage that displays available clubs and provides a form for adding new clubs.

The webpage is accessible at `http://localhost:8085`.
