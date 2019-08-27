FROM java:8
EXPOSE 8080:8080
ADD /target/sprintboot-0.0.1-SNAPSHOT.jar sprintboot-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","sprintboot-0.0.1-SNAPSHOT.jar"]