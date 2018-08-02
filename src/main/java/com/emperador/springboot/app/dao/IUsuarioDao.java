package com.emperador.springboot.app.dao;

import org.springframework.data.repository.CrudRepository;

import com.emperador.springboot.app.entity.Usuario;

public interface IUsuarioDao extends CrudRepository<Usuario, Long>{

	public Usuario findByUsername(String username);
}
