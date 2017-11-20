#!/bin/sh

echo '************************************************************************'
echo "starting the eureka server"
echo '************************************************************************'

java -agentlib:jdwp=transport=dt_socket,address=5006,server=y,suspend=n \
	-Djava.security.egd=file:/dev/./urandom \
	-jar /work/*.jar 
