FROM openjdk:8-jdk-alpine

VOLUME /tmp

ARG JAR_FILE


ARG {JAR_FILE} app.jar

ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/app.jar"]