package com.metatron.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.metatron.service.UsuarioService;

@Controller
@RequestMapping("usuario")
public class UsuarioController {
	
	@Autowired
	private UsuarioService usuarioService;	

	@SuppressWarnings("rawtypes")
	@GetMapping("/listar")
	@ResponseBody
	public ResponseEntity<List> listar(@RequestParam("nome") String nome, @RequestParam("cargo") String cargo) {
		List usuarios = usuarioService.getUsuarios(nome,cargo);
		if(usuarios.isEmpty()){
			return new ResponseEntity<List>(HttpStatus.NO_CONTENT);
		}
		return new ResponseEntity<List>(usuarios, HttpStatus.OK);
	}
}
