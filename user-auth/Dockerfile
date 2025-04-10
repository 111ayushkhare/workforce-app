FROM openjdk:17-jdk-slim

WORKDIR /user-role-app

COPY ./target/user-auth-0.0.1.jar /user-role-app

EXPOSE 8001

ENTRYPOINT ["java", "-jar", "user-auth-0.0.1.jar"]
