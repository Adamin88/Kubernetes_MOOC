# Stage 1: Build step utilizing Java 25 standard Maven tools
FROM maven:3.9.11-eclipse-temurin-25-alpine AS build
WORKDIR /app
COPY pom.xml .
COPY src ./src
RUN mvn clean package -DskipTests

# Stage 2: Runtime step containing the minimal Java 25 runtime environment
FROM eclipse-temurin:25-jdk-alpine
WORKDIR /app
COPY --from=build /app/target/*.jar app.jar
EXPOSE 8080
USER 1000
ENTRYPOINT ["java", "-jar", "app.jar"]