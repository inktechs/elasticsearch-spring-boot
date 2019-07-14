FROM openjdk:10-jre-slim
COPY ./target/elasticsearch-spring-boot-0.0.1-SNAPSHOT.jar /usr/src/app/
WORKDIR /usr/src/app
EXPOSE 8089
ENTRYPOINT ["java", "-jar", "elasticsearch-spring-boot-0.0.1-SNAPSHOT.jar"]