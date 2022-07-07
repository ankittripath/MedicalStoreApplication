FROM  openjdk:17
ADD target/MedicalStore.jar MedicalStore.jar
EXPOSE 8889
ENTRYPOINT ["java","-jar","/MedicalStore.jar"]	