FROM openjdk:11

COPY build/libs/hello-java-kubernetes-0.0.1-SNAPSHOT.jar /opt/myapp/

WORKDIR /opt/myapp/

ENTRYPOINT ["java", "-jar", "/opt/myapp/hello-java-kubernetes-0.0.1-SNAPSHOT.jar"]

EXPOSE 8080
