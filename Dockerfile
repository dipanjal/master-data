FROM amazoncorretto:11

#ARG JAR_FILE=build/libs/*.jar


ARG APP_DIR=/tmp
WORKDIR ${APP_DIR}
COPY master-data.jar .
#CMD["/bin/bash"]
ENTRYPOINT ["java", "-Dspring.profiles.active=${ACTIVE_PROFILE}", "-jar", "master-data.jar"]


#RUN mkdir -p ${APP_DIR}

#RUN cp application.jar ${APP_DIR}

#WORKDIR ${APP_DIR}