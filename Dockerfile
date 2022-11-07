FROM openjdk:11

ENTRYPOINT ["java", "-jar", "build/libs/github-action-test-0.0.1-SNAPSHOT.jar"]