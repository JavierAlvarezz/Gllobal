package com.gllobal.demo.entity;

import java.sql.Date;

import org.springframework.format.annotation.DateTimeFormat;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "equipo")
@Getter
@Setter
public class Equipo {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "cod_equipo", length = 6, nullable = false)
	private Long cod_equipo;
	
	@Column(name = "nom_equipo")
	private String nom_equipo;
	
	@Column(name = "fech_mantenimiento")
	@Temporal(TemporalType.DATE) 
    @DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date fecha_mantenimiento;
}
