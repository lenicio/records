package br.com.zorp.api.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
public class Usuario {
  private String nome;
  private int idade;
  private TipoUsuario tipoUsuario;


  public String exibirDetalhes() {
    return "-------------------------" +
        "\nNome: " + getNome() +
        "\nIdade: " + getIdade() +
        "\nTipo: " + getTipoUsuario() +
        "\n-------------------------";
  }

}
