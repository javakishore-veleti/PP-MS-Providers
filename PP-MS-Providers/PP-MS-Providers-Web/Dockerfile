FROM adoptopenjdk:11-jre-hotspot as builder

ENV WORKDIR_PATH=provider-portal

ENV SERVICE_ACCOUNT_USER=providerportaluser

RUN addgroup -S ${SERVICE_ACCOUNT_USER} && adduser -S ${SERVICE_ACCOUNT_USER} -G ${SERVICE_ACCOUNT_USER}

USER ${SERVICE_ACCOUNT_USER}:${SERVICE_ACCOUNT_USER}

WORKDIR ${WORKDIR_PATH}

ARG JAR_FILE=target/*.jar

COPY ${JAR_FILE} provider-portal-providers.jar

EXPOSE 8080

CMD ["java","-jar","/provider-portal-providers.jar"]
