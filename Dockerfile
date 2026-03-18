# Stage 1: Build (Używamy obrazu Maven z Eclipse Temurin)
FROM maven:3.9.6-eclipse-temurin-17 AS build
WORKDIR /app
# Kopiujemy pom.xml najpierw, aby wykorzystać cache warstw Dockera
COPY pom.xml .
RUN mvn dependency:go-offline
COPY . .
RUN mvn clean package -DskipTests

# Stage 2: Runtime (Używamy czystego obrazu Eclipse Temurin - lekki i bezpieczny)
FROM eclipse-temurin:17-jre-alpine
WORKDIR /app
# Kopiujemy zbudowany plik jar z poprzedniego etapu
COPY --from=build /app/target/*.jar app.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "app.jar"]