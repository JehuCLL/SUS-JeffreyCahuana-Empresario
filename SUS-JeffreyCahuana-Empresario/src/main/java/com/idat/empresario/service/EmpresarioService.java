package com.idat.empresario.service;

import java.util.List;

import com.idat.empresario.model.Empresario;

public interface EmpresarioService {
	List<Empresario> listar();
	Empresario obtenerId(Integer id);
	void guardar(Empresario empresario);
	void eliminar(Integer id);
	void actualizar(Empresario empresario);
}
