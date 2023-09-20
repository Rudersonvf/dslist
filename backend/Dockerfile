# Use uma imagem base oficial do OpenJDK para Java 17
FROM openjdk:17-jdk

# Defina o diretório de trabalho dentro do contêiner
WORKDIR /app

# Copie todos os arquivos do seu aplicativo Spring para o contêiner
COPY . .

# Certifique-se de que o Maven Wrapper está presente e execute a compilação (se necessário)
# Você pode adicionar outros comandos de construção aqui, dependendo da estrutura do seu projeto
RUN chmod +x mvnw
RUN ./mvnw clean install

# Porta em que o aplicativo Spring está configurado para ouvir
EXPOSE 8380

# Comando para executar o aplicativo Spring
CMD ["./mvnw", "spring-boot:run"]

