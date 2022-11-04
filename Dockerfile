FROM adoptopenjdk/openjdk11
RUN ["./gradlew", "clean"]
RUN ["./gradlew", "build"]
CMD ["./mvnw", "clean", "package"]
ARG JAR_FILE_PATH=target/ecr.jar
COPY ${JAR_FILE_PATH} app.jar
ENTRYPOINT ["java", "-jar", "app.jar"]
