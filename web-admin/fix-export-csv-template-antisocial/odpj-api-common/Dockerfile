# FROM gradle:4.7.0-jdk8-alpine AS build
FROM gradle:jdk17-alpine AS build

COPY --chown=gradle:gradle . /home/gradle/service

WORKDIR /home/gradle/service
RUN chmod +x gradlew
RUN ./gradlew build --stacktrace
# RUN ./gradlew build --no-daemon