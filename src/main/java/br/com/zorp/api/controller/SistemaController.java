package br.com.zorp.api.controller;

import br.com.zorp.api.dto.UsuarioDto;
import br.com.zorp.api.model.Sistema;
import br.com.zorp.api.model.Usuario;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/sistema")
public class SistemaController {

  Sistema sistema = new Sistema();

  @GetMapping
  public String listar() {
    String ret = "";

    for (Usuario usuario : sistema.getUsuarios()) {''
      ret += usuario.exibirDetalhes() + "\n";
    }

    return ret;
  }

  @PostMapping
  public String adicionar(@RequestBody UsuarioDto dado) {
    sistema.adicionar(
        new Usuario(
            dado.nome(),
            dado.idade(),
            dado.tipoUsuario()
        ));

    return "Usuário adicionado com sucesso!";
  }

}
