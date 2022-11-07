FROM openjdk:11
ARG JAR_FILE=github-action-test/build/libs/*.jar
COPY ${JAR_FILE} app.jar
ENTRYPOINT ["java", "-jar", "app.js"]