Bygg koden:
mvn package

Bygg docker image:
sudo docker build --rm=true -t simple-microservice .

Kjør service:
sudo docker run -p 8081:8081 simple-microservice

