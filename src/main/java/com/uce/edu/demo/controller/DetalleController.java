package com.uce.edu.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.uce.edu.demo.repository.modelo.ReporteVenta;
import com.uce.edu.demo.service.IDetalleService;

@Controller
@RequestMapping("/detalles")
public class DetalleController {
	
	@Autowired
	private IDetalleService detalleService;
	
	//GET
//	@GetMapping("/reporte/{fecha}/{categoria}/{cantidad}")
//	public String generarReporte(Model modelo, @PathVariable("fecha") LocalDateTime fecha, @PathVariable("categoria") String categoria, @PathVariable("cantidad") Integer cantidad) {
//		List<ReporteVenta> reporte = this.detalleService.generarReporteVentas(fecha, categoria, cantidad);
//		modelo.addAttributte("reportes", reporte);
//      return "vistaReportes";
//	}

}
