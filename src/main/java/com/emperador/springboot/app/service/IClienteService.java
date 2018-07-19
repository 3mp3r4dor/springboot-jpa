package com.emperador.springboot.app.service;

import java.util.List;

import com.emperador.springboot.app.entity.Cliente;

public interface IClienteService {

	public List<Cliente> findAll();

	public void save(Cliente cliente);

	public Cliente findOne(Long id);

	public void delete(Long id);
}
