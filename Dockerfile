FROM  amazoncorretto:11-alpine-jdk
MAINTAINER  FAH
COPY  target/fah-0.0.1-SNAPSHOT.jar heilifabian-app.jar
ENTRYPOINT  ["java","-jar","/heilifabian-app.jar"]