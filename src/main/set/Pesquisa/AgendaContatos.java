package main.set.Pesquisa;

import java.util.HashSet;
import java.util.Set;

public class AgendaContatos {
  //atributo
  private Set<Contato> contatosSet;

  public AgendaContatos() {
    this.contatosSet = new HashSet<>();
  }

  public void adicionarContato(String nome, int numero) {
    contatosSet.add(new Contato(nome, numero));
  }

  public void exibirContatos() {
    if (!contatosSet.isEmpty()) {
      System.out.println(contatosSet);
    } else {
      System.out.println("O conjunto está vazio!");
    }
  }

  public Set<Contato> pesquisarPorNome(String nome) {
    Set<Contato> contatosPorNome = new HashSet<>();
    if (!contatosSet.isEmpty()) {
      for (Contato c : contatosSet) {
        if (c.getNome().startsWith(nome)) {
          contatosPorNome.add(c);
        }
      }
      return contatosPorNome;
    } else {
      throw new RuntimeException("O conjunto está vazio!");
    }
  }

  public Contato atualizarNumeroContato(String nome, int novoNumero) {
    Contato contatoAtualizado = null;
    if (!contatosSet.isEmpty()) {
      for (Contato c : contatosSet) {
        if (c.getNome().equalsIgnoreCase(nome)) {
          c.setNumero(novoNumero);
          contatoAtualizado = c;
          break;
        }
      }
      return contatoAtualizado;
    } else {
      throw new RuntimeException("O conjunto está vazio!");
    }
  }

  public static void main(String[] args) {
    
    AgendaContatos agendaContatos = new AgendaContatos();

    agendaContatos.exibirContatos();

    agendaContatos.adicionarContato("Biatriz", 123456789);
    agendaContatos.adicionarContato("Biatriz Meirelles", 987654321);
    agendaContatos.adicionarContato("Maria", 55555555);
    agendaContatos.adicionarContato("João", 88889999);
    agendaContatos.adicionarContato("Cassi", 88885555);
    agendaContatos.adicionarContato("Cassi Tamandare", 77778888);
    agendaContatos.adicionarContato("Carolina", 55555555);

    agendaContatos.exibirContatos();

    System.out.println(agendaContatos.pesquisarPorNome("Biatriz"));

    Contato contatoAtualizado = agendaContatos.atualizarNumeroContato("Cassi", 44443333);
    System.out.println("Contato atualizado: " + contatoAtualizado);

    System.out.println("Contatos na agenda após atualização:");
    agendaContatos.exibirContatos();
  }
}