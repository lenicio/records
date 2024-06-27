package br.com.zorp.api.controller;

import br.com.zorp.api.dto.UsuarioDto;
import br.com.zorp.api.model.Usuario;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/hello")
public class HelloController {

  @PostMapping
  public String hello(@RequestBody UsuarioDto dado) {

    Usuario usuario = new Usuario(
        dado.nome(),
        dado.idade()
    );

    return usuario.exibirDetalhes();
  }

}
