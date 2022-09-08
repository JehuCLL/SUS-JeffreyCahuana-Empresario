package com.idat.empresario.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.idat.empresario.model.Empresario;

public interface EmpresarioRepository extends JpaRepository<Empresario, Integer> {

}
