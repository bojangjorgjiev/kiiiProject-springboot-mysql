FROM openjdk:17
ADD demo-0.0.1-SNAPSHOT.jar demo-0.0.1-SNAPSHOT.jar
EXPOSE 8000
ENTRYPOINT ["java", "-jar", "demo-0.0.1-SNAPSHOT.jar"]

#comment