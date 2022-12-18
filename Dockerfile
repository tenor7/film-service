FROM openjdk:17
ARG JAR_FILE=./build/libs/film-service-0.0.1-SNAPSHOT.jar
ADD ${JAR_FILE} film-service-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java", "-jar","film-service-0.0.1-SNAPSHOT.jar"]
EXPOSE 8081
