FROM openjdk:8-jdk-alpine

RUN addgroup -S spring && adduser -S spring -G spring
USER spring:spring

ARG JAR_FILE=build/libs/*.jar
COPY ${JAR_FILE} /bin/app/boot.jar
WORKDIR /bin/app

ENTRYPOINT ["java","-jar","boot.jar"]

EXPOSE 8080/tcp