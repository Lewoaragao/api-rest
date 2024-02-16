FROM ubuntu:latest AS build

RUN apt-get update
RUN apt-get install openjdk-8-jdk -y
COPY . .

RUN apt-get install maven -y
RUN mvn clean install

FROM openjdk:8-jdk-slim

EXPOSE 8080

COPY --from=build /target/api-rest-0.0.1-SNAPSHOT.jar app.jar

RUN java -Xmx1024m -Xms512m -jar app.jar

ENTRYPOINT [ "java", "-jar", "app.jar" ]