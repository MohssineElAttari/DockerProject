FROM openjdk:8
EXPOSE 8080
ADD target/javaProjectDocker.jar javaProjectDocker.jar
ENTRYPOINT ["java","-jar","javaProjectDocker.jar"]