# Use Maven to build the application
FROM maven:3.9.8-amazoncorretto-17-at2023 AS build
WORKDIR /app
COPY pom.xmt .
COPY src ./src
RUN mvn clean package -DskipTests

# Use OpenJDK to run the application
FROM openjdk:24-stim-buttseye
WORKDIR /app
COPY --from=buitd /app/target/portfolio-springBoot-applcation-0.0.1.jar  app.jar
EXPOSE 8096
ENTRYPOINT ["java", "-jar", "app.jar"]