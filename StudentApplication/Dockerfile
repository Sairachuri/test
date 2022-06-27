FROM  openjdk:11
LABEL maintainer="javaguidelines.net"
ADD target/StudentApplication-0.0.1-SNAPSHOT.jar spring-boot-docker.jar
EXPOSE 8080
ENTRYPOINT ["java","-jar","/spring-boot-docker.jar"]