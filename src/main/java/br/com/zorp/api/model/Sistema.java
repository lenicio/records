package br.com.zorp.api.model;

import java.util.ArrayList;
import java.util.List;

public class Sistema {
  List<Usuario> usuarios;

  public Sistema() {
    this.usuarios = new ArrayList<>();
  }

  public void adicionar(Usuario usuario) {
    usuarios.add(usuario);
  }


}
