FROM java:8-jdk-alpine

VOLUME /tmp

ARG JAR_FILE=target/orderservice-0.0.1-SNAPSHOT.jar

# Add the application's jar to the container
ADD ${JAR_FILE} orderservice-0.0.1-SNAPSHOT.jar

# Run the jar file 
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/orderservice-0.0.1-SNAPSHOT.jar"]

EXPOSE 8002
