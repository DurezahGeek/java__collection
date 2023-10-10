# Operações Básicas com Set

## Conjunto de Convidados
- Classe "ConjuntoConvidados" com um conjunto de "Convidados".
- Métodos:
  - `adicionarConvidado(String nome, int codigoConvite)`: Adiciona um convidado.
  - `removerConvidadoPorCodigoConvite(int codigoConvite)`: Remove um convidado.
  - `contarConvidados()`: Conta o número total de convidados.
  - `exibirConvidados()`: Exibe todos os convidados.

## Conjunto de Palavras Únicas
- Classe "ConjuntoPalavrasUnicas" com um conjunto de palavras únicas.
- Métodos:
  - `adicionarPalavra(String palavra)`: Adiciona uma palavra.
  - `removerPalavra(String palavra)`: Remove uma palavra.
  - `verificarPalavra(String palavra)`: Verifica se uma palavra está presente.
  - `exibirPalavrasUnicas()`: Exibe todas as palavras únicas.

## Pesquisa em Set

### Agenda de Contatos
- Classe "AgendaContatos" com um conjunto de "Contatos".
- Métodos:
  - `adicionarContato(String nome, int numero)`: Adiciona um contato.
  - `exibirContatos()`: Exibe todos os contatos.
  - `pesquisarPorNome(String nome)`: Pesquisa contatos pelo nome.
  - `atualizarNumeroContato(String nome, int novoNumero)`: Atualiza o número de telefone de um contato.
  
### Lista de Tarefas
- Classe "ListaTarefas" com um conjunto de "Tarefas".
- Métodos:
  - `adicionarTarefa(String descricao)`: Adiciona uma tarefa.
  - `removerTarefa(String descricao)`: Remove uma tarefa.
  - `exibirTarefas()`: Exibe todas as tarefas.
  - `contarTarefas()`: Conta o número total de tarefas.
  - `obterTarefasConcluidas()`: Retorna tarefas concluídas.
  - `obterTarefasPendentes()`: Retorna tarefas pendentes.
  - `marcarTarefaConcluida(String descricao)`: Marca uma tarefa como concluída.
  - `marcarTarefaPendente(String descricao)`: Marca uma tarefa como pendente.
  - `limparListaTarefas()`: Remove todas as tarefas.

## Ordenação em Set

### Cadastro de Produtos
- Classe "CadastroProdutos" com um conjunto de "Produtos".
- Métodos:
  - `adicionarProduto(long cod, String nome, double preco, int quantidade)`: Adiciona um produto.
  - `exibirProdutosPorNome()`: Exibe produtos por ordem alfabética de nome.
  - `exibirProdutosPorPreco()`: Exibe produtos por ordem crescente de preço.
  
### Lista de Alunos
- Classe "GerenciadorAlunos" com um conjunto de "Alunos".
- Métodos:
  - `adicionarAluno(String nome, long matricula, double media)`: Adiciona um aluno.
  - `removerAluno(long matricula)`: Remove um aluno.
  - `exibirAlunosPorNome()`: Exibe alunos por ordem alfabética de nome.
  - `exibirAlunosPorNota()`: Exibe alunos por ordem crescente de nota.
  - `exibirAlunos()`: Exibe todos os alunos.
