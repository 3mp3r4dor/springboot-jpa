package com.emperador.springboot.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.emperador.springboot.app.dao.IClienteDao;
import com.emperador.springboot.app.entity.Cliente;

@Service
public class ClienteServiceImpl implements IClienteService {

	@Autowired
	private IClienteDao clienteDao;
	
	@Override
	@Transactional(readOnly=true)
	public List<Cliente> findAll() {
		
		return clienteDao.findAll();
	}

	@Override
	@Transactional
	public void save(Cliente cliente) {
 
		clienteDao.save(cliente);
		
	}

	@Override
	@Transactional(readOnly=true)
	public Cliente findOne(Long id) {
		
		return clienteDao.findOne(id);
	}
	
	@Transactional
	@Override
	public void delete(Long id) {
		 
		clienteDao.delete(id);
		
	}

}