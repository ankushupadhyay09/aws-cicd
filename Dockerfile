FROM openjdk:17


WORKDIR /app

COPY ./build/libs/course-api.jar /app

EXPOSE 8080

CMD ["java", "-jar", "course-api.jar"]
