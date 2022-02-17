FROM amazoncorretto:11.0.4

WORKDIR /home/app/

ADD target/*.jar /home/app/app.jar

# added on 20220217 by Praveen to bind mount for log router
VOLUME ["/home/app/application_logs/"]

ENTRYPOINT [ \
    "java",\
    "-Djava.security.egd=file:/dev/./urandom",\
    "-jar",\
    "/home/app/app.jar"\
]
