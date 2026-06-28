<div align="center">
  <img src="https://jsdelivr.net" height="80" alt="Java Logo" />
  <img src="https://jsdelivr.net" height="80" alt="Spring Logo" />
  <img src="https://jsdelivr.net" height="80" alt="PostgreSQL Logo" />
  <h1>[API REST]</h1>
  <p>🚀 <i>API REST robusta desenvolvida com Spring Boot e persistência de dados em PostgreSQL.</i></p>
</div>

<p align="center">
  <img src="https://shields.io[KarlaSilva37]/[API-REST]?style=for-the-badge&color=2c3e50" alt="Stars">
  <img src="https://shields.io[KarlaSilva37]/[API-REST]?style=for-the-badge&color=2c3e50" alt="Forks">
  <img src="https://shields.io[KarlaSilva37]/[API-REST]?style=for-the-badge&color=2c3e50" alt="License">
</p>

---

## 📌 Sobre o Projeto

["Esta API está sendo desenvolvida para gerenciar o fluxo de vendas e controle de estoque de um e-commerce, permitindo operações completas de CRUD para produtos, clientes e pedidos."]

### 🛠️ Principais Funcionalidades
- 🔄 **CRUD Completo:** Gerenciamento eficiente e validação de dados de [Entidade Ex: Usuários/Produtos].
- 📊 **Relatórios/Filtros:** Busca paginada e filtros avançados na API.
- 🗄️ **Persistência Relacional:** Modelagem de dados estruturada com PostgreSQL e JPA.
- 🔓 **Rotas Públicas:** API simplificada sem necessidade de autenticação para consumo imediato.

---

## 🚀 Tecnologias e Ferramentas

- **Java 17** 
- **Spring Boot 3.5.15**
- **Spring Data JPA** (Persistência)
- **PostgreSQL** (Banco de Dados Relacional)
- **Maven** (Gerenciador de Dependências)
- **Bruno** (API Client para testes)

---

## 🗺️ Rotas da API (Endpoints)

A API possui os seguintes endpoints principais para interação:

### Entidade: `[Product]`

| Método | Endpoint | Descrição | Parâmetros / Body |
| :--- | :--- | :--- | :--- |
| `GET` | `/products` | Lista todos os registros (Paginado) | Nenhum |
| `GET` | `/productss/{id}` | Busca um registro por ID | `id` no path |
| `POST` | `/products` | Cria um novo registro | JSON com os dados |
| `PUT` | `/products/{id}` | Atualiza um registro existente | `id` no path + JSON |
| `DELETE` | `/products/{id}` | Remove um registro | `id` no path |

### 📝 Exemplo de Requisição (POST)

Para criar um novo registro na API, utilize o seguinte formato de corpo (`body`):

```json
{
  "nome": "João Silva",
  "email": "joao@email.com",
  "idade": 25
}
```

---

## 🐶 Testando a API com o Bruno

Para facilitar os testes dos endpoints, este projeto inclui uma coleção pronta para o **Bruno** (API Client de código aberto e focado em privacidade).

<p align="left">
  <img src="https://shields.io" alt="Bruno API Client">
</p>

### Como importar as requisições:
1. Instale o **Bruno** na sua máquina.
2. Abra o aplicativo do Bruno.
3. Clique em **"Open Collection"** (Abrir Coleção).
4. Selecione a pasta `API REST e-commerce` localizada na raiz deste repositório.
5. Pronto! Todas as rotas e corpos de requisição (JSON) estarão carregadas e prontas para uso.

---

## 💻 Como Configurar e Rodar o Projeto

### Pré-requisitos
* **JDK 17** ou superior instalado.
* **PostgreSQL** rodando localmente (ou via Docker).

### 1. Configuração do Banco de Dados
Antes de rodar a aplicação, crie um banco de dados vazio no seu PostgreSQL com o nome do projeto (ex: `meu_projeto_db`). 

Em seguida, ajuste as credenciais no arquivo `src/main/resources/application.properties` (or `.yml`):

```properties
spring.datasource.url=jdbc:postgresql://localhost:5432/meu_projeto_db
spring.datasource.username=seu_usuario_postgres
spring.datasource.password=sua_senha_postgres

```

### 2. Executando a Aplicação

Abra o terminal na pasta raiz do projeto e execute os comandos:

```bash
# Instalar as dependências do Maven
./mvnw clean install

# Iniciar a aplicação Spring Boot
./mvnw spring-boot:run
```

A API estará pronta para receber requisições em `http://localhost:8081`.

---

## 📦 Estrutura do Código

```text
├── API REST e-commerce/    # Pasta com os arquivos de requisição do Bruno (.yml)
└── src
    └── main
        └── java
            └── com
                └── KarlaSilva37
                    └── API-REST
                        ├── config       # Configurações do Spring (Cors, Swagger)
                        ├── controller   # Controladores REST (Exposição das rotas)
                        ├── dto          # Data Transfer Objects (Validação e tráfego de dados)
                        ├── exception    # Tratamento global de erros da API
                        ├── model        # Entidades mapeadas para o PostgreSQL (JPA)
                        ├── repository   # Interfaces que estendem JpaRepository
                        └── service      # Camada de regras de negócio
```

---

## 📄 Licença

Este projeto está sob a licença [MIT](LICENSE). Veja o arquivo completo para mais detalhes.

---
<p align="center">Desenvolvido com ☕ por <a href="https://github.com[KarlaSilva37]">[Karla Danielle]</a></p>
