# EnvironWasteManagementAssessmentApplication

This is a Spring Boot application for managing waste categories, disposal guidelines, and recycling tips. It exposes RESTful APIs for data retrieval and manipulation, utilizing an H2 in-memory database for storage.

## Features

- Manage waste categories
- Provide disposal guidelines
- Offer recycling tips
- JSON-formatted responses
- Input validation using Spring Boot validation annotations
- Global exception handling

## Project Structure

- `model` package: Contains the entity classes `WasteCategory`, `DisposalGuidelines`, and `RecyclingTips`.
- `repository` package: Contains the repository interfaces `WasteCategoryRepository`, `DisposalGuidelinesRepository`, and `RecyclingTipsRepository`.
- `service` package: Contains the service interfaces and their implementations for managing waste categories, disposal guidelines, and recycling tips.
- `controller` package: Contains the REST controllers for handling API requests.
- `exception` package: Contains custom exception classes and a global exception handler.
- `DataInitializer.java`: Pre-populates the database with initial data.

## Running the Application

1. Clone the repository:
    ```bash
    git clone https://github.com/Khetha100/grad001.khethukuthulasimamane.git
    cd grad001.khethukuthulasimamane
    ```

2. Build and run the application:
    ```bash
    ./mvnw spring-boot:run
    ```

3. The application will start and listen on port 8081.

## Configuration

The application uses the following configuration for the H2 database:

```properties
spring.datasource.url=jdbc:h2:mem:testdb
spring.datasource.driverClassName=org.h2.Driver
spring.datasource.username=sa
spring.datasource.password=password
spring.jpa.database-platform=org.hibernate.dialect.H2Dialect
spring.h2.console.enabled=true
server.port=8081
```

To access the H2 console, navigate to http://localhost:8081/h2-console and use the following credentials:

yaml

JDBC URL: jdbc:h2:mem:testdb
Username: sa
Password: password

# API Endpoints
## Waste Category

    GET /waste-categories: Retrieve all waste categories
    GET /waste-categories/{id}: Retrieve a specific waste category
    POST /waste-categories: Create a new waste category
    PUT /waste-categories/{id}: Update a specific waste category
    DELETE /waste-categories/{id}: Delete a specific waste category

## Disposal Guidelines

    GET /disposal-guidelines: Retrieve all disposal guidelines
    GET /disposal-guidelines/{id}: Retrieve a specific disposal guideline
    POST /disposal-guidelines: Create a new disposal guideline
    PUT /disposal-guidelines/{id}: Update a specific disposal guideline
    DELETE /disposal-guidelines/{id}: Delete a specific disposal guideline

## Recycling Tips

    GET /recycling-tips: Retrieve all recycling tips
    GET /recycling-tips/{id}: Retrieve a specific recycling tip
    POST /recycling-tips: Create a new recycling tip
    PUT /recycling-tips/{id}: Update a specific recycling tip
    DELETE /recycling-tips/{id}: Delete a specific recycling tip

## Exception Handling

The application includes a global exception handler to manage various exceptions, providing meaningful error responses.

## Author

Khethukuthula Simamane