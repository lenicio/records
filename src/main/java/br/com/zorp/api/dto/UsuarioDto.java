package br.com.zorp.api.dto;

import br.com.zorp.api.model.TipoUsuario;

public record UsuarioDto(String nome, int idade, TipoUsuario tipoUsuario) {
}
