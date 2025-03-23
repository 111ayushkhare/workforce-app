# Project Name

## Overview

This repository contains the initial setup for a microservices-based application using **Spring Boot**.

## Microservices Architecture

This repository consists of several microservices, each fulfilling a specific function within the overall system. Below is a list of the main microservices included in the repository:

1. **User-Auth** – Service reponsible for user, their roles and auth management.


Each service runs independently and can be scaled, deployed, and maintained independently of others.

---

## Prerequisites

Ensure that you have the following installed on your local machine:

- **Java 11+** (or the required version specified for each microservice)
- **Maven**
- **Docker** (if using containerization)
- **Kubernetes** (if deploying in a Kubernetes cluster)
- **Git** (for version control)

---

## Setting Up the Project

1. **Clone the Repository:**

   ```bash
   git clone https://github.com/111ayushkhare/workforce-app.git
   cd workforce-app
   ```

2. **Install Dependencies:**

   For each microservice, navigate to its respective directory and run:

   ```bash
   mvn clean install
   ```

   This will install all the dependencies required for each microservice.

---

## Running Microservices

Each microservice can be run independently using the following command:

### 1. **Running Microservice A:**

   Navigate to the directory where Microservice A is located and run:

   ```bash
   mvn spring-boot:run
   ```

   By default, this will start the service on **localhost:8080** (or as defined in the `application.properties` or `application.yml` file).

### 2. **Running Microservice B:**

   Similarly, for Microservice B:

   ```bash
   mvn spring-boot:run
   ```

   This service will start on **localhost:8081**, and so on for each service.

---

## Dockerization

You can run the microservices inside Docker containers for better isolation and ease of deployment. Docker Compose makes it even easier to manage and run multiple services.

### **Build and Run Microservices Using Docker Compose**

   Instead of building and running Docker images manually for each microservice, you can use Docker Compose to manage the entire process.

   Follow these steps:

   - **Build and Start the Services**:

     From the root directory (where `docker-compose.yml` is located), run the following command:

     ```bash
     docker-compose up --build
     ```

     This will build the images for all the services defined in the `docker-compose.yml` file and start the containers. 

   - **Accessing Services**:

     After the containers are running, you can access the services on the following ports:

     - `user-auth` service will be accessible at:  
       `http://localhost:8081`

---

## Building the Project

To build the entire project, including all microservices, navigate to the root directory of the repository and run:

```bash
mvn clean install
```

This will build all the services and generate the appropriate `.jar` files for each microservice. 

---

## Deployment (Optional)

For deployment, you can use **Kubernetes** (if using Kubernetes) or deploy the `.jar` files directly to your cloud provider. Example for Kubernetes deployment:

1. Create Kubernetes deployment files for each microservice (e.g., `microservice-a-deployment.yml`).
2. Apply them to the Kubernetes cluster:

   ```bash
   kubectl apply -f microservice-a-deployment.yml
   kubectl apply -f microservice-b-deployment.yml
   ```

---

## API Documentation

Each microservice exposes REST APIs. Please refer to the **Swagger** documentation for API endpoints. Swagger can be accessed by navigating to:

- **Service A:** [http://localhost:8080/swagger-ui.html](http://localhost:8080/swagger-ui.html)
- **Service B:** [http://localhost:8081/swagger-ui.html](http://localhost:8081/swagger-ui.html)

If you are using **Spring Fox Swagger** or another documentation tool, the documentation URLs may differ.

---

## Testing

To run unit and integration tests for each microservice, use:

```bash
mvn test
```

This will run all the tests and provide results in the terminal.

---

## Troubleshooting

- If you face issues with dependencies or port conflicts, ensure the following:
  - Ports for each service are unique (e.g., 8080 for Service A, 8081 for Service B, etc.).
  - All required environment variables are set correctly in the `application.properties` or `application.yml` files.

- If you encounter errors related to database or external services, ensure that all required services are running (e.g., database, message broker).

---

## License

This project is licensed under the [The Play Around License](LICENSE).

---
