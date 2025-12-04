# REGRAS ESSENCIAIS PARA O INÍCIO (V1)

Este documento contém as regras mínimas para garantir a consistência do código e a segurança do nosso repositório no GitHub.

---
<br>

## 1. Padronização de nomes

O código precisa ser consistente. Se todo mundo nomear as coisas da mesma forma, o trabalho de um se encaixa no código do outro.

| O Que É | Como Nomear | Exemplo Prático |
| :--- | :--- | :--- |
| **Classes** (Estruturas: `Tarefa`, `Projeto`) | **Sempre começa com letra Maiúscula.** | `Tarefa`, `ProjetoDAO` |
| **Ações e Dados** (Tudo o resto: variáveis, métodos) | **Sempre começa com letra minúscula.** | `calcularTempoGasto`, `nomeDoUsuario` |

---

<br>

## 2. Segurança do Código (GitHub)

O objetivo é que ninguém apague ou quebre o trabalho do outro por acidente.

1.  **Proteção:** A **`main`** é a nossa versão final. **Ninguém envia código diretamente para ela!**
2.  **Trabalho Individual:** Para começar a trabalhar, você deve **sempre** criar um "galho" (branch) novo. O nome do galho deve ser o seu **nome + a tarefa**.
    * **Exemplo:** Se o João vai fazer o cadastro de Tarefas, ele cria o galho **`joao/crud-tarefa`**.
3.  **Pedido de Revisão:** Quando você terminar sua parte, você **pede para o sênior revisar** o seu galho e juntar com o código principal.

---
<br>

## 3. Mensagems (Assunto no Git)

Quando você salva seu trabalho no GitHub, a mensagem precisa ser clara. Use sempre uma palavra para dizer o que foi feito:

| Palavra | Significado | Exemplo Prático |
| :--- | :--- | :--- |
| **`feat:`** | Você fez uma **coisa nova**. | `feat: Adiciona CRUD básico de Tarefa` |
| **`fix:`** | Você **consertou um erro**. | `fix: Corrige bug na conexão com o banco de dados` |
| **`docs:`** | Você **mudou a documentação** (Regras, README). | `docs: Atualiza as regras do projeto` |