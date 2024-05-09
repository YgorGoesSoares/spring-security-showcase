# Showcase de Spring Security

Este projeto é um exemplo de como implementar autenticação usando Spring Security em uma aplicação Spring Boot. Ele demonstra como usar as principais classes e interfaces de Spring Security, incluindo `UserDetails`, `UserDetailsService`, `JwtService` e `AuthenticationController`.

## Visão Geral

Este projeto implementa um sistema de autenticação usando Spring Security. Inclui:

- **UserDetails**: Implementação personalizada de `UserDetails`, representando os dados do usuário.
- **UserDetailsService**: Implementação personalizada de `UserDetailsService`, carregando os detalhes do usuário com base em um identificador.
- **TokenService**: Serviço para lidar com tokens de autenticação.
- **AuthenticationController**: Controlador para lidar com solicitações de autenticação e autorização.

## Como Usar

1. Clone o projeto para o seu ambiente local.
2. Navegue até o diretório do projeto.
3. Execute o projeto com o comando:

    ```bash
    ./mvnw spring-boot:run
    ```

4. O projeto será executado em `http://localhost:8080`.
5. Interaja com as rotas de autenticação disponíveis em `http://localhost:8080/auth`.

## Principais Componentes

- `UserDetails`:
  - Interface representando detalhes do usuário, incluindo nome de usuário, senha, permissões e outros dados relevantes.
- `UserDetailsService`:
  - Interface para carregar detalhes do usuário a partir de uma fonte de dados, como um banco de dados ou um serviço externo.
- `TokenService`:
  - Serviço para gerar, validar e manipular tokens de autenticação.
- `AuthenticationController`:
  - Controlador que lida com solicitações de login.

## Diagrama de Interfaces Principais do Spring Security

![Diagrama de Interfaces Principais do Spring Security](https://i.imgur.com/Yc8kPSm.png)

## Implementação

Os conceitos deste projeto implementados mais a fundo podem ser visto em alguns de meus outros projetos:
- [Gerenciador de Eventos](https://github.com/YgorGoesSoares/event-manager-showcase)
- [O Catálogo](https://github.com/YgorGoesSoares/thecatalog-project)
- [API de Notícias](https://github.com/YgorGoesSoares/api-noticias/)

## Feito por

Feito por Ygor Goes | [LinkedIn](https://www.linkedin.com/in/ygor-goes)
