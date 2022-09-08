package com.idat.empresario.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.idat.empresario.model.Empresario;
import com.idat.empresario.repository.EmpresarioRepository;

public class EmpresarioServiceImpl implements EmpresarioService{
	
	@Autowired
	private EmpresarioRepository repository;
	
	@Override
	public List<Empresario> listar() {
		return repository.findAll();
	}

	@Override
	public Empresario obtenerId(Integer id) {
		return repository.findById(id).orElse(null);
	}

	@Override
	public void guardar(Empresario empresario) {
		repository.save(empresario);
	}

	@Override
	public void eliminar(Integer id) {
		repository.deleteById(id);
	}

	@Override
	public void actualizar(Empresario empresario) {
		repository.saveAndFlush(empresario);
	}
	
	
}
