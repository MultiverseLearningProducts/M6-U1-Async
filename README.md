# JSE Module 6 – Lab 1: APIs and Services

Self-contained Skillable lab for **Workshop 1 – APIs and Services**. Implement an API client that sends GET, POST, PUT, and DELETE requests and analyses responses.

## Contents

- **Starter code:** Maven/Spring Boot project with `ApiClient` skeleton to complete.
- **Skillable instructions:** `skillable-lab-w1-apis-services.md` (upload this as the lab Instructions in Skillable).

## Prerequisites

- Java 17+
- Maven 3.6+ (or use included `./mvnw`)

## Quick start

```bash
./mvnw spring-boot:run
```

Complete the methods in `src/main/java/com/jse/module06/lab01/ApiClient.java`, then uncomment the example calls in `Lab01ApisServicesApplication.run()` to test against [JSONPlaceholder](https://jsonplaceholder.typicode.com/).

## Pushing to Git

This folder is intended to be a separate Git repository:

```bash
cd output/jse/module-06/lab-01-apis-services
git init
git add .
git commit -m "Initial commit: Lab 1 APIs and Services starter and Skillable instructions"
git remote add origin <your-repo-url>
git push -u origin main
```

## Lab alignment

- **Module:** JSE Module 6 – Building APIs in Java  
- **Workshop:** 1 – APIs and Services  
- **Learning objectives:** Implement API requests (GET, POST, PUT, DELETE) with appropriate headers and bodies; analyse status codes and JSON responses; handle errors.
