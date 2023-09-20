
# Use a slim version of the official OpenJDK base image for Java 17
FROM openjdk:17-jdk-slim

# Set the working directory inside the container
WORKDIR /app

# Copy all files from your Spring application to the container
COPY . .

# Make sure the Maven Wrapper is present and run the build (if needed)
# You can add other build commands here, depending on your project structure

# Add the curl package to install it, which is needed to download Maven Wrapper
# Update the apt-get command to accept the 'curl' package
RUN apt-get update && apt-get install -y curl

# Fix the typo in the command, should it be 'chmod' not 'chmode'
RUN chmod +x mvnw

# Also, fix the typo in the command, it should be './mvnw' not '.\mvnw'
RUN ./mvnw clean install

# Expose the port that the Spring application is configured to listen on
# The error message indicates that the Dockerfile has not exposed port 8183,
# but the previous line correctly exposes port 8182, so no changes are needed here.

# Command to run the Spring application
CMD ["./mvnw", "spring-boot:run"]
