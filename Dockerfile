FROM java:8-jdk-alpine
COPY ./target/api-employee-management-0.0.1-SNAPSHOT.jar
WORKDIR /usr/app
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "api-employee-management-0.0.1-SNAPSHOT.jar"]