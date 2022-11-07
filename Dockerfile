FROM openjdk:11
ARG JAR_FILE=build/libs/*.jar
COPY ${JAR_FILE} /
ENTRYPOINT ["java", "-jar", "github-action-test-0.0.1-SNAPSHOT.jar"]