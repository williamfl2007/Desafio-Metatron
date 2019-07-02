package com.metatron.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.metatron.dao.UsuarioDao;

@Service
public class UsuarioServiceImp implements UsuarioService{

	@Autowired
	private UsuarioDao usuarioDao;
	
	@SuppressWarnings({ "rawtypes", "unchecked" })
	@Override
	public List getUsuarios(String nome, String cargo){		
		return usuarioDao.getUsuarios(nome,cargo);
	}

}
