#! /bin/sh
echo 'build the project'
./gradlew clean build

echo 'running container'
docker-compose up -d