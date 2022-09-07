package com.uce.edu.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.uce.edu.demo.repository.modelo.Producto;
import com.uce.edu.demo.repository.modelo.ProductoStock;
import com.uce.edu.demo.service.IProductoService;

@Controller
@RequestMapping("/productos")
public class ProductoController {

	@Autowired
	private IProductoService productoService;

	// GET
	@GetMapping("/buscar")
	public String buscarTodos(Model modelo) {
		List<Producto> lista = this.productoService.buscarTodos();
		modelo.addAttribute("productos", lista);
		return "vistaListaProductos";
	}

	@GetMapping("/buscarCodigo/{codProducto}")
	public String buscarProducto(@PathVariable("codProducto") String cod, Model modelo) {
		System.out.println("El código: " + cod);
		ProductoStock prod = this.productoService.consultarStock(cod);
		System.out.println("El producto es: " + prod);
		modelo.addAttribute("productoStock", prod);
		return "vistaProducto";
	}

	// POST
	@PostMapping("/ingresar")
	public String ingresarProducto(Producto producto) {
		this.productoService.ingresarProducto(producto);
		return "redirect:/productos/buscar";
	}

	// Métodos de redireccionamientos a páginas
	@GetMapping("/nuevoProducto")
	public String paginaNuevoProducto(Producto producto) {
		return "vistaNuevoProducto";
	}

}
