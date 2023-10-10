package main.list.Ordenacao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoPessoas {
  //atributo
  private List<Pessoa> pessoaList;

  public OrdenacaoPessoas() {
    this.pessoaList = new ArrayList<>();
  }

  public void adicionarPessoa(String nome, int idade, double altura) {
    pessoaList.add(new Pessoa(nome, idade, altura));
  }

  public List<Pessoa> ordenarPorIdade() {
    List<Pessoa> pessoasPorIdade = new ArrayList<>(pessoaList);
    if (!pessoaList.isEmpty()) {
      Collections.sort(pessoasPorIdade);
      return pessoasPorIdade;
    } else {
      throw new RuntimeException("A lista está vazia!");
    }
  }

  public List<Pessoa> ordenarPorAltura() {
    List<Pessoa> pessoasPorAltura = new ArrayList<>(pessoaList);
    if (!pessoaList.isEmpty()) {
      Collections.sort(pessoasPorAltura, new ComparatorPorAltura());
      return pessoasPorAltura;
    } else {
      throw new RuntimeException("A lista está vazia!");
    }
  }

  public static void main(String[] args) {
    OrdenacaoPessoas ordenacaoPessoas = new OrdenacaoPessoas();

    ordenacaoPessoas.adicionarPessoa("Biatriz", 22, 1.67);
    ordenacaoPessoas.adicionarPessoa("Cassi", 32, 1.76);
    ordenacaoPessoas.adicionarPessoa("Vitoria", 22, 1.62);
    ordenacaoPessoas.adicionarPessoa("Jovita", 48, 1.56);

    System.out.println(ordenacaoPessoas.pessoaList);

    System.out.println(ordenacaoPessoas.ordenarPorIdade());

    System.out.println(ordenacaoPessoas.ordenarPorAltura());
  }
}