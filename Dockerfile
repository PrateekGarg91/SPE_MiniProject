FROM openjdk
COPY ./target/calculator-1.0-SNAPSHOT.jar ./
WORKDIR ./
CMD ["java","-cp","calculator-1.0-SNAPSHOT.jar","org/example/Calculator"]