# Operações Básicas com Map

## Agenda de Contatos
- Classe "AgendaContatos" com um Map para armazenar contatos.
- Métodos:
  - `adicionarContato(String nome, Integer telefone)`: Adiciona um contato.
  - `removerContato(String nome)`: Remove um contato.
  - `exibirContatos()`: Exibe todos os contatos.
  - `pesquisarPorNome(String nome)`: Pesquisa um contato por nome.

## Dicionário
- Classe "Dicionario" com um Map para armazenar palavras e suas definições.
- Métodos:
  - `adicionarPalavra(String palavra, String definicao)`: Adiciona uma palavra e sua definição.
  - `removerPalavra(String palavra)`: Remove uma palavra.
  - `exibirPalavras()`: Exibe todas as palavras e definições.
  - `pesquisarPorPalavra(String palavra)`: Pesquisa uma palavra e retorna a definição.

## Pesquisa em Map

### Estoque de Produtos com Preço
- Classe "EstoqueProdutos" com um Map para armazenar produtos, quantidades e preços.
- Métodos:
  - `adicionarProduto(long cod, String nome, int quantidade, double preco)`: Adiciona um produto.
  - `exibirProdutos()`: Exibe produtos, quantidades e preços.
  - `calcularValorTotalEstoque()`: Calcula o valor total do estoque.
  - `obterProdutoMaisCaro()`: Retorna o produto mais caro.
  - `obterProdutoMaisBarato()`: Retorna o produto mais barato.
  - `obterProdutoMaiorQuantidadeValorTotalNoEstoque()`: Retorna o produto com maior quantidade e valor total.

### Contagem de Palavras
- Classe "ContagemPalavras" com um Map para contar palavras em um texto.
- Métodos:
  - `adicionarPalavra(String palavra, Integer contagem)`: Adiciona uma palavra à contagem.
  - `removerPalavra(String palavra)`: Remove uma palavra.
  - `exibirContagemPalavras()`: Exibe palavras e contagens.
  - `encontrarPalavraMaisFrequente()`: Encontra a palavra mais frequente.

## Ordenação nos Map

### Agenda de Eventos
- Classe "AgendaEventos" com um Map para armazenar eventos.
- Métodos:
  - `adicionarEvento(LocalDate data, String nome, String atracao)`: Adiciona um evento à agenda.
  - `exibirAgenda()`: Exibe a agenda em ordem crescente de data.
  - `obterProximoEvento()`: Retorna o próximo evento.

### Livraria Online
- Classe "LivrariaOnline" com um Map para armazenar livros.
- Métodos:
  - `adicionarLivro(String link, String titulo, String autor, private double preco)`: Adiciona um livro à livraria.
  - `removerLivro(String titulo)`: Remove um livro.
  - `exibirLivrosOrdenadosPorPreco()`: Exibe livros por ordem de preço.
  - `pesquisarLivrosPorAutor(String autor)`: Retorna livros por autor.
  - `obterLivroMaisCaro()`: Retorna o livro mais caro.
  - `obterLivroMaisBarato()`: Retorna o livro mais barato.
