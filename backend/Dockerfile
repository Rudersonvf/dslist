
# Use an official OpenJDK base image for Java 17
FROM openjdk:17-jdk

# Set the working directory inside the container
WORKDIR /app

# Copy all files from your Spring application to the container
COPY . .

# Make sure the Maven Wrapper is present and run the build (if needed)
# You can add other build commands here, depending on your project structure
RUN chmod +x mvnw
RUN ./mvnw clean install

# Expose the port that the Spring application is configured to listen on
EXPOSE 8080

# Command to run the Spring application
CMD ["./mvnw", "spring-boot:run"]
