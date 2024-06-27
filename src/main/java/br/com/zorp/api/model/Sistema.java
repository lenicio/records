package br.com.zorp.api.model;

import lombok.Getter;

import java.util.ArrayList;
import java.util.List;

@Getter
public class Sistema {
  private int idUsuario;
  List<Usuario> usuarios;

  public Sistema() {
    this.usuarios = new ArrayList<>();
    this.idUsuario = 1;
  }

  public void adicionar(Usuario usuario) {
    idUsuario++;
    usuarios.add(usuario);
  }

  public void deletar(int id) {
    for (Usuario usuario : usuarios) {
      if (usuario.getId() == id) {
        usuarios.remove(usuario);
      }
    }
  }


}
