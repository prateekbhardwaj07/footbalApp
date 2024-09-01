FROM amazoncorretto:8u422-al2023
VOLUME /tmp
EXPOSE 8080
ARG JAR_FILE=target/footballapp.jar
ADD ${JAR_FILE} footballapp.jar
ENTRYPOINT ["java", "-jar", "footballapp.jar"]
