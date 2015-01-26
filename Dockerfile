FROM java:8-jre
# FROM jeanblanchard/busybox-java:8
COPY /target/emb-app-1.0-SNAPSHOT.jar /app/
ENV AVG=12
WORKDIR /app
CMD ["java", "-jar", "/app/emb-app-1.0-SNAPSHOT.jar"]
