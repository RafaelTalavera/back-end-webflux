# Reactive WebFlux Backend with Spring Boot

This project implements a reactive backend using Spring WebFlux and MongoDB to manage playlists.

## Features

- Retrieve all playlists.
- Retrieve a playlist by ID.
- Create a new playlist.
- Continuously retrieve playlists (WebFlux).
- Retrieve playlists (MVC).

## Project Structure

The project follows the standard structure of a Spring Boot project with the following key components:

- Controllers: Handle HTTP requests.
- Services: Business logic and repository calls.
- Repositories: Access MongoDB database.
- Configuration: MongoDB configuration file.
- Models: Classes representing MongoDB documents.

## Configuration and Dependencies

**MongoDB Configuration:**
```properties
# MongoDB Configuration
spring.data.mongodb.uri=mongodb://localhost:27017/webflux

## Execution
**Ensure MongoDB is installed and configured.**
# Clone the repository
git clone https://your-repository.git

# Navigate to the project directory
cd back-end-webflux

# Run the application
./mvnw spring-boot:run



Your application will be available at http://localhost:8080.


### This code provides a concise description of the project along with details about configuration and necessary dependencies.
Be sure to replace the repository URL and clone commands with the correct information for your project.

