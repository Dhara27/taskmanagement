# Use an official OpenJDK runtime as a parent image
FROM openjdk

# Set the working directory
WORKDIR /app

# Copy the project JAR file to the container
COPY target/taskmanagement-0.0.1-SNAPSHOT.jar app.jar

# Expose the port on which the app runs
EXPOSE 8080

# Run the JAR file
ENTRYPOINT ["java", "-jar", "app.jar"]
