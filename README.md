# Patient Management System

A microservices-based patient management system demonstrating modern cloud-native technologies including Spring Boot, gRPC, Kafka, Docker, and AWS deployment.

## Architecture

This project consists of two main microservices:

- **Patient Service**: Manages patient records and basic CRUD operations
- **Billing Service**: Handles billing accounts and financial transactions

Services communicate via gRPC for internal calls and expose REST APIs for external clients. Asynchronous messaging is handled through Kafka.

## Technologies

- **Spring Boot**: Framework for building microservices
- **gRPC**: High-performance RPC framework for service-to-service communication
- **Kafka**: Distributed event streaming platform
- **Docker**: Containerization for easy deployment
- **AWS**: Cloud platform for hosting and scaling
