package com.spring.rest.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.rest.dao.IPiezaDao;
import com.spring.rest.dto.Pieza;

@Service
public class PiezaServiceImpl implements IPiezaService{

	@Autowired
	IPiezaDao iPiezaDao;
	
	@Override
	public List<Pieza> listarPiezas() {
		// TODO Auto-generated method stub
		return iPiezaDao.findAll();
	}

	@Override
	public Pieza guardarPieza(Pieza pieza) {
		// TODO Auto-generated method stub
		return iPiezaDao.save(pieza);
	}

	@Override
	public Pieza piezaXID(Long codigo) {
		// TODO Auto-generated method stub
		return iPiezaDao.findById(codigo).get();
	}

	@Override
	public Pieza actualizarPieza(Pieza pieza) {
		// TODO Auto-generated method stub
		return iPiezaDao.save(pieza);
	}

	@Override
	public void eliminarPieza(Long codigo) {
		// TODO Auto-generated method stub
		
	}

}
