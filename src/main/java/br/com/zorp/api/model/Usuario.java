package br.com.zorp.api.model;

public class Usuario {
  private String nome;
  private int idade;

  public Usuario(String nome, int idade) {
    this.nome = nome;
    this.idade = idade;
  }

  public String exibirDetalhes() {
    return "-------------------------" +
        "\nNome: " + getNome() +
        "\nIdade: " + getIdade() +
        "\n-------------------------";
  }

  public String getNome() {
    return nome;
  }

  public int getIdade() {
    return idade;
  }


}
