FROM openjdk:17
ADD target/movie-app.jar movie-app.jar
ENTRYPOINT ["java", "-jar" , "movie-app.jar"]