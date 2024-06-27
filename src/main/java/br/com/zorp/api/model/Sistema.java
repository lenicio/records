package br.com.zorp.api.model;

import lombok.Getter;

import java.util.ArrayList;
import java.util.List;

@Getter

public class Sistema {
  List<Usuario> usuarios;

  public Sistema() {
    this.usuarios = new ArrayList<>();
  }

  public void adicionar(Usuario usuario) {
    usuarios.add(usuario);
  }


}
