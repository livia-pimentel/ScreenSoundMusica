# 🎵 ScreenSound Músicas

![Java](https://img.shields.io/badge/Java-17%2B-orange)
![Spring Boot](https://img.shields.io/badge/Spring-Boot-brightgreen)
![PostgreSQL](https://img.shields.io/badge/PostgreSQL-Database-blue)

Aplicação backend desenvolvida em Java utilizando o framework **Spring Boot** e **Spring Data JPA** para persistência de dados. O projeto consiste em um sistema de gerenciamento de músicas e artistas através do console, permitindo o cadastro e a busca de informações em um banco de dados relacional.

Este projeto foi desenvolvido como parte da formação **Backend em Java** do programa **Oracle Next Education (ONE)** em parceria com a **Alura**.

## 🔨 Funcionalidades

O sistema conta com um menu interativo no console que oferece as seguintes opções:

- **1 - Cadastrar artistas:** Permite registrar novos artistas no banco de dados, incluindo o tipo (solo, dupla, banda).
- **2 - Cadastrar músicas:** Associa novas músicas a um artista já existente.
- **3 - Listar músicas:** Exibe todas as músicas cadastradas no sistema.
- **4 - Buscar músicas por artistas:** Filtra e exibe as músicas de um artista específico.
- **9 - Sair:** Encerra a aplicação.

## 🛠️ Tecnologias Utilizadas

- **Java** (JDK 17 ou superior)
- **Spring Boot** (Framework principal)
- **Spring Data JPA** (Camada de persistência)
- **PostgreSQL** (Banco de dados relacional)
- **Maven** (Gerenciador de dependências)
- **IntelliJ IDEA** (IDE recomendada)

## 🗂️ Estrutura do Banco de Dados

O projeto utiliza o **PostgreSQL** localmente. As tabelas principais são:
* `artistas`: Armazena o nome e o tipo do artista.
* `musicas`: Armazena o título da música e faz o relacionamento com o artista.

## 🚀 Como Executar o Projeto

### Pré-requisitos
* Java JDK instalado.
* PostgreSQL instalado e rodando.
* Maven instalado.

### Configuração do Banco de Dados
Antes de rodar, certifique-se de configurar as variáveis de ambiente ou o arquivo `src/main/resources/application.properties` com suas credenciais do Postgres:

```properties
spring.datasource.url=jdbc:postgresql://localhost:5432/screensound
spring.datasource.username=${DB_USER}
spring.datasource.password=${DB_PASSWORD}
spring.jpa.hibernate.ddl-auto=update