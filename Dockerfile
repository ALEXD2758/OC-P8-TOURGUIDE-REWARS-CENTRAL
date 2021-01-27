FROM openjdk:8-alpine
WORKDIR /usr/app
COPY build/libs/rewardsCentral-1.0.0.jar tourguide-rewards-central.jar
CMD ["java", "-jar", "tourguide-rewards-central.jar"]