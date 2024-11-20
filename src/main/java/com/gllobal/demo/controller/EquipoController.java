package com.gllobal.demo.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.gllobal.demo.entity.Equipo;
import com.gllobal.demo.service.EquipoService;
import com.gllobal.demo.utils.AppSettings;

@RestController
@RequestMapping("/api/equipo")
@CrossOrigin(origins = AppSettings.URL_CROSS_ORIGIN)
public class EquipoController {
	
	@Autowired
	private EquipoService service;
	
	@PostMapping("/registrar")
	@ResponseBody
	public ResponseEntity<?> insertarEquipo(@RequestBody Equipo bean) {
		Map<String, Object> salida = new HashMap<>();	
		
		try {
			
			Equipo objSalida = service.registrarEquipo(bean);
			if(objSalida == null) {
				salida.put("mensaje", AppSettings.MENSAJE_REG_ERROR);
			}else {
				salida.put("mensaje", AppSettings.MENSAJE_REG_EXITOSO);
			}
		} catch (Exception e) {
			e.printStackTrace();
			salida.put("mensaje", AppSettings.MENSAJE_REG_ERROR_CRITICAL);
		}	

		return ResponseEntity.ok(salida);
	}

}
