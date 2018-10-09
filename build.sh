#!/usr/bin/env bash

mvn clean package
mvn -f trips/pom.xml dockerfile:build