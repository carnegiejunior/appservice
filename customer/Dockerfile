FROM openjdk
WORKDIR /app
COPY target/customer-1.0-SNAPSHOT.jar /app/customer-app.jar
ENTRYPOINT ["java", "-jar", "customer-app.jar"]