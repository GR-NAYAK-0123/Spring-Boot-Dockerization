FROM eclipse-temurin:17
WORKDIR /app1
COPY target/*.jar /app1
CMD ["java", "-jar", "GreetingMessage.jar"]