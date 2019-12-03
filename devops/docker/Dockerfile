FROM openjdk:11-jdk AS buildenv

# prepare Gradle
WORKDIR /app
ADD gradlew /app
ADD gradle /app/gradle
RUN ./gradlew --version >/dev/null

FROM buildenv AS build
ADD .git /app/.git
ADD src /app/src
ADD build.gradle /app
ADD settings.gradle /app
WORKDIR /app
RUN ./gradlew --no-daemon bootJar

FROM openjdk:11-slim AS app
EXPOSE 8080
RUN mkdir /app
COPY --from=build /app/build/libs/*.jar /app
ADD ./devops/docker/entrypoint.sh /
ENTRYPOINT [ "/entrypoint.sh" ]
