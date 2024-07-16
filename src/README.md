# API REST del Foro

Este proyecto es una API REST para un foro de discusión donde los usuarios pueden crear, listar y eliminar temas. El proyecto está desarrollado con Spring Boot y utiliza JWT para la autenticación y autorización.

## Requisitos

- Java 17
- Maven
- PostgreSQL

## Configuración

1. Clona el repositorio.
2. Configura la base de datos en el archivo `src/main/resources/application.properties`.
3. Crea la base de datos PostgreSQL.
4. Ejecuta el script `src/main/resources/data.sql` para insertar datos de ejemplo.
5. Ejecuta la aplicación con Maven:

```bash
mvn spring-boot:run
