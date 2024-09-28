FROM openjdk:11
EXPOSE 8080
ADD target/consultaarquitectura-0.0.1-SNAPSHOT.jar consultaarquitectura-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java", "-jar", "/consulta_taller2_arquitectura-0.0.1-SNAPSHOT.jar"]
