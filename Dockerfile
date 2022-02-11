FROM openjdk:17.0.1
ADD target/spring-docker-app-1.0.0.jar spring-docker-app-1.0.0.jar
EXPOSE 8080
ENTRYPOINT ["java","-jar","spring-docker-app-1.0.0.jar"]
