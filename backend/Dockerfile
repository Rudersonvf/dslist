# Use uma imagem base oficial do OpenJDK para Java 17
FROM openjdk:17-jdk

# Defina o diretório de trabalho dentro do contêiner
WORKDIR /app

# Copie todos os arquivos do seu aplicativo Spring para o contêiner
COPY . .

# Porta em que o aplicativo Spring está configurado para ouvir
EXPOSE 8380

# Comando para compilar e executar o aplicativo Spring
CMD ["./mvnw", "spring-boot:run"]

