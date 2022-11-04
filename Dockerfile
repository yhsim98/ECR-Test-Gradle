FROM adoptopenjdk/openjdk11
RUN ["./gradlew", "clean"]
RUN ["./gradlew", "build"]
ARG JAR_FILE_PATH=build/libs/ROOT.jar
COPY ${JAR_FILE_PATH} ROOT.jar
ENTRYPOINT ["java", "-jar", "ROOT.jar"]
