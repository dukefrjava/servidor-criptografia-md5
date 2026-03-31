# CriptografiaMD5
- Projeto feito durante aulas de Desenvolvimento web em camadas e Sistemas Distribuidos
- API REST em Spring Boot para gerar hash MD5 de palavras via browser.

## Tecnologias

- Java 21
- Spring Boot 3.2
- HTML/CSS/JS (frontend estático)

## Como rodar

```bash
mvn spring-boot:run
```

Acesse: `http://localhost:8080`

## Endpoint

```
GET /md5/{palavra}
```

**Exemplo:**
```
GET http://localhost:8080/md5/hello
→ 5D41402ABC4B2A76B9719D911017C592
```

## Estrutura

```
src/main/
├── java/com/example/criptografiaMD5/
│   ├── CriptografiaMd5Application.java
│   └── controller/
│       ├── ICriptografia.java
│       └── Criptografia.java
└── resources/
    └── static/
        └── index.html
```
