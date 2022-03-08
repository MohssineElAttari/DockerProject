FROM ubuntu:8
EXPOSE 8080
ADD target/java_project_docker.jar java_project_docker.jar
ENTRYPOINT ["java",".jar","/java_project_docker.jar"]