FROM amazoncorretto:11

ARG JAR_FILE=build/libs/*.jar
ARG APP_DIR=/opt/app/

WORKDIR ${APP_DIR}
COPY ${JAR_FILE} ${APP_DIR}/application.jar
ENTRYPOINT ["java", "-Dspring.profiles.active=${ACTIVE_PROFILE}", "-jar", "application.jar"]
