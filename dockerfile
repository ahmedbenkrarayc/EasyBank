FROM openjdk:8-jdk

WORKDIR /app

COPY src ./src

RUN mkdir bin

RUN javac -d bin $(find src -name "*.java")

CMD ["java", "-cp", "bin", "main.EasyBank"]
