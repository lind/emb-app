## Bygg koden
    mvn package

Lager en uberjar med maven-shade-plugin og Jetty som servlet container.

## Lag docker image
Bruker [jre 8 image](https://registry.hub.docker.com/_/java/) som base. Gir et image på ca 300M

    sudo docker build --rm=true -t simple-microservice .

Med [busybox-java](https://registry.hub.docker.com/u/jeanblanchard/busybox-java/) som base blir imaget på ca 160M.

## Starte servicen
    sudo docker run -p 8081:8081 simple-microservice

## boot2docker på OSX
[How to Use Docker on OS X: The Missing Guide](http://viget.com/extend/how-to-use-docker-on-os-x-the-missing-guide)

* Finn ip til VM'et der docker imaget: boot2docker ip
* Port som brukes: docker ps
