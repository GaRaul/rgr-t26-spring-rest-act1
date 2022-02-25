package com.spring.rest.service;

import java.util.List;

import com.spring.rest.dto.Suministra;

public interface ISuministraService {
	
	public List<Suministra> listarSuministra();
	
	public Suministra guardarSuministra(Suministra suministra);
	
	public Suministra suministraXID(Long id); 
	
	public Suministra actualizarSuministra(Suministra suministra); 
	
	public void eliminarSuministra(Long id);
	
}
