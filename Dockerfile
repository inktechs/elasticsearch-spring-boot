FROM openjdk:10-jre-slim
COPY ./target/elasticsearch-spring-boot-1.0.0-SNAPSHOT.jar /usr/src/app/
WORKDIR /usr/src/app
EXPOSE 8080
CMD ["java", "-jar", "elasticsearch-spring-boot-1.0.0-SNAPSHOT.jar"]