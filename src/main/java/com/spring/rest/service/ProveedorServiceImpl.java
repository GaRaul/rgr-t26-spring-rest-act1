package com.spring.rest.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.rest.dao.IProveedorDao;
import com.spring.rest.dto.Proveedor;

@Service
public class ProveedorServiceImpl implements IProveedorService {

	@Autowired
	IProveedorDao iProveedorDao;

	@Override
	public List<Proveedor> listarProveedores() {

		return iProveedorDao.findAll();
	}

	@Override
	public Proveedor guardarProveedor(Proveedor proveedor) {

		return iProveedorDao.save(proveedor);
	}

	@Override
	public Proveedor proveedorXID(Long codigo) {

		return iProveedorDao.findById(codigo).get();

	}

	@Override
	public Proveedor actualizarProveedor(Proveedor proveedor) {

		return iProveedorDao.save(proveedor);
		
	}

	@Override
	public void eliminarProveedor(Long codigo) {

		iProveedorDao.deleteById(codigo);
		
	}

}
