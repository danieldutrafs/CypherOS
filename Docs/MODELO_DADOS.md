# MODELO DE DADOS CYPHEROS (V1)

Este documento define a estrutura de todas as classes que compõem o pacote `model/`. Esta estrutura deve ser seguida rigorosamente, pois ela é a base para o banco de dados e para a inteligência futura do CypherOS.

## 1. Classe: `Tarefa`

Representa uma atividade de estudo ou trabalho. Contém as métricas essenciais para o assistente algorítmico (Complexidade e Tempo Gasto).

| Atributo | Tipo em Java | Observações |
| :--- | :--- | :--- |
| `private int idTarefa` | `int` | Chave primária. |
| `private String nomeTarefa` | `String` | Nome da tarefa (Obrigatório). |
| `private int complexidade` | `int` | Nível de dificuldade (Ex: 1 = Fácil, 5 = Difícil). |
| `private String status` | `String` | Estado atual (Ex: 'pendente', 'concluído', 'em andamento'). |
| `private int tempoEstimado` | `int` | Tempo que o usuário *acha* que vai gastar (em minutos). |
| `private int tempoRealGasto` | `int` | O tempo *real* registrado (Métrica de aprendizado). |
| `private LocalDate dataLimite` | `LocalDate` | Data final para a entrega/conclusão. |
| `private int fkProjeto` | `int` | Chave estrangeira, liga a tarefa ao Projeto. |




## 2. Classe: `Projeto`
Representa um grupo maior de tarefas (ex: "Trabalho Final da Faculdade").

| Atributo | Tipo em Java | Observações |
| :--- | :--- | :--- |
| `private int idProjeto` | `int` | Chave primária. |
| `private String nomeProjeto` | `String` | Nome do projeto (Obrigatório). |
| `private String descricao` | `String` | |
| `private LocalDate dataLimite` | `LocalDate` | Data final para o projeto. |

## 3. Classe:
Representa um horário bloqueado na agenda do usuário (ex: Aula, Consulta, Reunião). Essencial para o cálculo de tempo livre do assistente.

| Atributo | Tipo em Java | Observações |
| :--- | :--- | :--- |
| `private int idCompromisso` | `int` | Chave primária. |
| `private String nomeCompromisso` | `String` | Nome do evento (Obrigatório). |
| `private String descricao` | `String` | |
| `private LocalTime horaInicio` | `LocalTime` | Hora de início (Obrigatório). |
| `private LocalTime horaFim` | `LocalTime` | Hora de término. |

## 4. Classe:
Representa um material auxiliar, resumo ou link ligado diretamente a uma tarefa.

| Atributo | Tipo em Java | Observações |
| :--- | :--- | :--- |
| `private int idAnotacao` | `int` | Chave primária. |
| `private int fkTarefa` | `int` | Chave estrangeira, liga a anotação à Tarefa. |
| `private String nomeAnotacao` | `String` | Título do material. |
| `private String conteudo` | `String` | Texto, resumo ou URL do link. |
| `private String tipoMaterial` | `String` | Indica o tipo (Ex: 'link', 'texto', 'PDF'). |