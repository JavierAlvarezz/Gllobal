package com.gllobal.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.gllobal.demo.entity.Equipo;

public interface EquipoRepository extends JpaRepository<Equipo, String> {
	
	@Query("select e from Equipo e where e.cod_equipo = ?1 ")
	public abstract List<Equipo> listarIgualCodigo(String cod_equipo);
	
	
	
}
