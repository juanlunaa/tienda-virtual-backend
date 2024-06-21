package com.tiendavirtual.services;

import java.util.List;
import java.util.Optional;

import com.tiendavirtual.model.Producto;

public interface IProductoService {
	
	void createProduct(Producto p);
	
	Optional<Producto> getProduct(Integer id);
	
	List<Producto> getAllProducts();
	
	void deleteProduct(int id);
	
	void updateProduct(Producto p);
	
}
