package com.gllobal.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gllobal.demo.entity.Equipo;
import com.gllobal.demo.repository.EquipoRepository;

@Service
public class EquipoServiceImpl implements EquipoService {

	@Autowired
	private EquipoRepository repo;
	
	@Override
	public Equipo registrarEquipo(Equipo bean) {
		return repo.save(bean);
	}

	@Override
	public List<Equipo> listarIgualCodigo(String cod_equipo) {
		
		return repo.listarIgualCodigo(cod_equipo);
	}
	
}
