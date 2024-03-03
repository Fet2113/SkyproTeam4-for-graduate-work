# Онлайн магазин

Backend часть онлайн магазина.

## Используемые технологии

- Spring Framework
- Docker
- PostgreSQL
- Liquibase

## Запуск

### Frontend

```shell
docker run -d -p 3000:3000 ghcr.io/dmitry-bizin/front-react-avito:v1.21
```

### DB

```shell
docker run --name graduate-pg -p 5432:5432 -e POSTGRES_USER=postgres -e POSTGRES_PASSWORD=postgres -e POSTGRES_DB=graduatedb -d postgres
```

### Backend

Запуск `HomeworkApplication::main`

## API

После запуска backend части, swagger будет доступен по
url: [http://localhost:8080/swagger-ui/index.html](http://localhost:8080/swagger-ui/index.html)