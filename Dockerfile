FROM openjdk:11
EXPOSE 8080
VOLUME /tmp
ADD target/*.jar spring-boot-docker
ENTRYPOINT ["java","-jar","/spring-boot-docker"]