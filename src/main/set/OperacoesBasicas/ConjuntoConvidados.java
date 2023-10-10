package main.set.OperacoesBasicas;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoConvidados {
  //atributo
  private Set<Convidado> convidadosSet;

  public ConjuntoConvidados() {
    this.convidadosSet = new HashSet<>();
  }

  public void adicionarConvidado(String nome, int codigoConvite) {
    convidadosSet.add(new Convidado(nome, codigoConvite));
  }

  public void removerConvidadoPorCodigoConvite(int codigoConvite) {
    Convidado convidadoParaRemover = null;
    if (!convidadosSet.isEmpty()) {
      for (Convidado c : convidadosSet) {
        if (c.getCodigoConvite() == codigoConvite) {
          convidadoParaRemover = c;
          break;
        }
      }
      convidadosSet.remove(convidadoParaRemover);
    } else {
      throw new RuntimeException("O conjunto está vazio!");
    }
  }

  public int contarConvidados() {
    return convidadosSet.size();
  }

  public void exibirConvidados() {
    if (!convidadosSet.isEmpty()) {
      System.out.println(convidadosSet);
    } else {
      System.out.println("O conjunto está vazio!");
    }
  }

  public static void main(String[] args) {
    ConjuntoConvidados conjuntoConvidados = new ConjuntoConvidados();

    System.out.println("Existem " + conjuntoConvidados.contarConvidados() + " convidado(s) dentro do Set de Convidados");

    conjuntoConvidados.adicionarConvidado("Biatriz", 1231);
    conjuntoConvidados.adicionarConvidado("Cassi", 1232);
    conjuntoConvidados.adicionarConvidado("Vitória", 1233);
    conjuntoConvidados.adicionarConvidado("Jovita", 1234);

    System.out.println("Convidados no conjunto:");
    conjuntoConvidados.exibirConvidados();

    System.out.println("Existem " + conjuntoConvidados.contarConvidados() + " convidado(s) dentro do Set de Convidados");

    conjuntoConvidados.removerConvidadoPorCodigoConvite(1234);
    System.out.println("Existem " + conjuntoConvidados.contarConvidados() + " convidado(s) dentro do Set de Convidados após a remoção");

    System.out.println("Convidados no conjunto após a remoção:");
    conjuntoConvidados.exibirConvidados();
  }
}