#!/usr/bin/env bash

export CURRENT_DIR=$PWD

#### CLEAN PROJECTS ####

##customers-applications
cd customers-applications  && mvn clean package && cd ${CURRENT_DIR}
##customers-maint
cd customers-maint/        && mvn clean package && cd ${CURRENT_DIR}
##daas-service
cd risk-person-contract    && mvn clean package && cd ${CURRENT_DIR}

### DOCKER IMAGES BUILD ###

docker-compose build

### DOCKER COMPOSE RUN ###

docker-compose up -d