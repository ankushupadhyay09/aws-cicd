FROM openjdk:17


WORKDIR /app

COPY ./target/course-api.jar /app

EXPOSE 8080

CMD ["java", "-jar", "course-api.jar"]
