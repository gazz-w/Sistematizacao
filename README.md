# Sistematização
Este é um programa desenvolvido em Java com Spring Framework para realizar operações CRUD (Create, Read, Update, Delete) em uma aplicação de entregadores.

## Pré-requisitos

- Java JDK (versão 17.0.8.1ou superior) instalado
- PostgreSQL (ou outro banco de dados compatível) instalado e configurado
- 

## Configuração

1. Clone o repositório: `git clone https://github.com/gazz-w/Sistematizacao.git
2. Importe o projeto na sua IDE favorita (Eclipse, IntelliJ IDEA, etc.)
3. Configure as credenciais do banco de dados no arquivo `application.properties`
4. Execute a aplicação

## Uso

- Execute a aplicação e acesse os endpoints através de um cliente HTTP (Postman, cURL, etc.)
- Os endpoints disponíveis são:
  - `GET /entregadores`: Lista todos os entregadores
  - `GET /entregadores/{id}`: Detalha um entregador específico pelo ID
  - `POST /entregadores`: Cria um novo entregador
  - `PUT /entregadores/{id}`: Atualiza informações de um entregador existente
  - `DELETE /entregadores/{id}`: Remove um entregador pelo ID

Certifique-se de enviar requisições no formato correto (JSON, por exemplo) de acordo com o modelo de dados definido na aplicação.

## Contribuição

Contribuições são bem-vindas! Sinta-se à vontade para abrir uma issue ou um pull request.

## Autor

Gabriel Afonso Shimabuko - [GazzW](https://github.com/gazz-w)
