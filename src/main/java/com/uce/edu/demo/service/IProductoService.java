package com.uce.edu.demo.service;

import java.util.List;

import com.uce.edu.demo.repository.modelo.Producto;
import com.uce.edu.demo.repository.modelo.ProductoStock;

public interface IProductoService {

	public void ingresarProducto(Producto producto);

	public ProductoStock consultarStock(String codBarras);

	public List<Producto> buscarTodos();

}
