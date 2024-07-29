FROM openjdk:17


WORKDIR /app

COPY ./build/libs/course-api-0.0.1-SNAPSHOT.jar /app

EXPOSE 8080

CMD ["java", "-jar", "course-api-0.0.1-SNAPSHOT.jar"]
