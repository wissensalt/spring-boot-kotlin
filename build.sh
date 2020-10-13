#! /bin/sh
echo 'create gradle wrapper - install gradle if you do not have'
gradle wrapper

echo 'build the project'
./gradlew clean build

echo 'running container'
docker-compose up -d