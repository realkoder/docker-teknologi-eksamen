# Build Stage
FROM eclipse-temurin:17 as build
WORKDIR /workspace/app

COPY mvnw .
COPY .mvn .mvn
COPY pom.xml .
COPY src src

RUN ./mvnw install -DskipTests

# Run Stage
FROM eclipse-temurin:17-jre
WORKDIR /app

# Copy the JAR file from the build stage to the run stage
COPY --from=build /workspace/app/target/your-app.jar /app/your-app.jar

# Specify the command to run your application
CMD ["java", "-jar", "/app/your-app.jar"]