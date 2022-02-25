package com.spring.rest.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spring.rest.dto.Proveedor;

public interface IProveedorDao extends JpaRepository<Proveedor, Long>{

}
