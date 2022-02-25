package com.spring.rest.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spring.rest.dto.Pieza;

public interface IPiezaDao extends JpaRepository<Pieza, Long>{

}
