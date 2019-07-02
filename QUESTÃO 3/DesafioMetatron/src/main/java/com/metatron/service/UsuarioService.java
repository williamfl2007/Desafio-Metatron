package com.metatron.service;

import java.util.List;

import com.metatron.dto.UsuarioDto;

public abstract interface UsuarioService {
	
	public List<UsuarioDto> getUsuarios(String nome,String cargo);
}
