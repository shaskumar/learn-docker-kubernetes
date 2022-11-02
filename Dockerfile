FROM eclipse-temurin:17
RUN mkdir /opt/java-practice
#run sbt package beforehand so that jar file is present in target folder
COPY target/java-practice-0.0.1-SNAPSHOT.jar /opt/java-pratice/java-practice.jar
ARG SERVER_PORT=8080
EXPOSE ${SERVER_PORT}
CMD ["java", "-jar" ,"/opt/java-pratice/java-practice.jar"]