package main.list.Pesquisa;

import java.util.ArrayList;
import java.util.List;

public class CatalogoLivros {
  //atributo
  private List<Livro> livroList;

  public CatalogoLivros() {
    this.livroList = new ArrayList<>();
  }

  public void adicionarLivro(String titulo, String autor, int anoPublicacao) {
    livroList.add(new Livro(titulo, autor, anoPublicacao));
  }

  public List<Livro> pesquisarPorAutor(String autor) {
    List<Livro> livrosPorAutor = new ArrayList<>();
    if (!livroList.isEmpty()) {
      for (Livro l : livroList) {
        if (l.getAutor().equalsIgnoreCase(autor)) {
          livrosPorAutor.add(l);
        }
      }
      return livrosPorAutor;
    } else {
      throw new RuntimeException("A lista está vazia!");
    }
  }

  public List<Livro> pesquisarPorIntervaloAnos(int anoInicial, int anoFinal) {
    List<Livro> livrosPorIntervaloAnos = new ArrayList<>();
    if (!livroList.isEmpty()) {
      for (Livro l : livroList) {
        if (l.getAnoPublicação() >= anoInicial && l.getAnoPublicação() <= anoFinal) {
          livrosPorIntervaloAnos.add(l);
        }
      }
      return livrosPorIntervaloAnos;
    } else {
      throw new RuntimeException("A lista está vazia!");
    }
  }

  public Livro pesquisarPorTitulo(String titulo) {
    Livro livroPorTitulo = null;
    if (!livroList.isEmpty()) {
      for (Livro l : livroList) {
        if (l.getTitulo().equalsIgnoreCase(titulo)) {
          livroPorTitulo = l;
          break;
        }
      }
      return livroPorTitulo;
    } else {
      throw new RuntimeException("A lista está vazia!");
    }
  }

  public static void main(String[] args) {
    CatalogoLivros catalogoLivros = new CatalogoLivros();

    catalogoLivros.adicionarLivro("A cinco passos de você", "Rachael Lippincott", 2019);
    catalogoLivros.adicionarLivro("A culpa é das estrelas", "John Green", 2014);
    catalogoLivros.adicionarLivro("Como eu era antes de você", "Jojo Moyes", 2013);
    catalogoLivros.adicionarLivro("A menina que roubava livros", "Markus Zusak", 2012);

    System.out.println(catalogoLivros.pesquisarPorAutor("Markus Zusak"));

    System.out.println(catalogoLivros.pesquisarPorIntervaloAnos(2012, 2019));

    System.out.println(catalogoLivros.pesquisarPorTitulo("A culpa é das estrelas"));

    
  }
}
