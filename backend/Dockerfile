FROM openjdk:17.0.2-jdk
VOLUME /tmp
COPY ./target/app.jar app.jar
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/app.jar"]