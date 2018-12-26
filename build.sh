#!/usr/bin/env bash

mvn clean package
mvn -f trips/pom.xml dockerfile:build
mvn -f tickets/pom.xml dockerfile:build
mvn -f accommodations/pom.xml dockerfile:build