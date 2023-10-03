FROM eclipse-temurin:17
WORKDIR /app
COPY  ./staging/springbootng-0.0.1-SNAPSHOT.jar /app
EXPOSE 8083
CMD ["java", "-jar", "backend-0.0.1-SNAPSHOT.jar"]
