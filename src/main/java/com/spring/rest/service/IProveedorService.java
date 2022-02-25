package com.spring.rest.service;

import java.util.List;

import com.spring.rest.dto.Proveedor;

public interface IProveedorService {
	
	public List<Proveedor> listarProveedores();
	
	public Proveedor guardarProveedor(Proveedor proveedor);
	
	public Proveedor proveedorXID(Long codigo); 
	
	public Proveedor actualizarProveedor(Proveedor proveedor); 
	
	public void eliminarProveedor(Long codigo);
	
}
