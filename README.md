# 📋 Sistema Gerenciador de Tarefas

Este é um sistema simples de gerenciamento de tarefas desenvolvido em Java, executado via console, com o objetivo de praticar fundamentos importantes da programação e da programação orientada a objetos.

O projeto simula um pequeno sistema CRUD de tarefas, permitindo criar, listar, buscar, atualizar e remover tarefas através de um menu interativo no terminal.

---

# 🚀 Funcionalidades

O sistema permite ao usuário:

- ➕ Adicionar novas tarefas
- 📄 Listar todas as tarefas cadastradas
- ✅ Marcar uma tarefa como concluída
- ❌ Remover tarefas
- 🔎 Buscar uma tarefa pelo ID
- 🔎 Listar tarefas por prioridade
- ✏️ Atualizar informações de uma tarefa
- 📋 Menu interativo no terminal

---

# 🧠 Conceitos aplicados

Durante o desenvolvimento deste projeto foram aplicados conceitos importantes da linguagem Java:

- Programação Orientada a Objetos (POO)
- Encapsulamento
- Modelagem de entidades
- Organização em pacotes
- Estrutura de listas (ArrayList)
- Entrada de dados com Scanner
- Estruturas condicionais e de repetição
- Separação entre lógica de aplicação e entidade de domínio

---

# 📂 Estrutura do projeto
├─ src/
│   ├─ application/
│   │   └─ Program.java             # Classe principal (main) com o menu e interação com o usuário
│   │
│   ├─ entities/
│   │   ├─ Tarefa.java              # Representa uma tarefa com ID, descrição, prioridade e status
│   │   └─ GerenciadorTarefas.java # Classe que gerencia a lista de tarefas e operações
│   │
│   └─ enums/
│       └─ prioridade/
│           └─ Prioridade.java      # Enum com valores BAIXA, MEDIA e ALTA
│
└─ README.md                        # Documentação do projeto
### Program.java

Responsável por:

- executar o sistema
- controlar o menu interativo
- manipular a lista de tarefas
- gerenciar as operações do sistema

### Tarefa.java

Classe que representa a entidade **Tarefa**, contendo atributos como:

- ID
- título
- descrição
- status ou informações da tarefa

---

# ▶️ Como executar o projeto

1. Clone o repositório

```bash
git clone https://github.com/QualyFerrer/sistemaGerenciadorDeTarefas.git
```

2. Abra o projeto em uma IDE Java como:

- Eclipse IDE
- IntelliJ IDEA

3. Execute o arquivo:

```
Program.java
```

O sistema será executado no terminal com um menu de opções.

---

# 🎯 Objetivo do projeto

Este projeto foi desenvolvido com o objetivo de fortalecer a base em programação backend, praticando lógica de programação, modelagem de classes e organização de código.

Apesar de ser uma aplicação em console, o foco foi consolidar fundamentos importantes que serão utilizados em sistemas mais complexos no futuro.

---

# 📈 Possíveis melhorias futuras

Algumas evoluções planejadas para o projeto incluem:

- Persistência de dados em banco de dados
- Uso de coleções mais estruturadas
- Criação de uma API REST
- Interface gráfica ou web
- Implementação de camada de serviços

---

# 👨‍💻 Autor

**Cesar Ferrer**

Estudante de desenvolvimento backend com foco em Java, construindo projetos para fortalecer a base em desenvolvimento de software.
