package com.gllobal.demo.service;

import java.util.List;

import com.gllobal.demo.entity.Equipo;

public interface EquipoService {
	Equipo registrarEquipo(Equipo bean);
	
	public abstract List<Equipo> listarIgualCodigo(String cod_equipo);
}
