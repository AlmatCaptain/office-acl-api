FROM openjdk:8

ADD /target/office-acl-api-0.0.1-SNAPSHOT.jar office-acl-api-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java", "-jar", "office-acl-api-0.0.1-SNAPSHOT.jar"]

EXPOSE 8083