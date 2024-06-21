package com.tiendavirtual.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tiendavirtual.model.Producto;
import com.tiendavirtual.services.IProductoService;

@CrossOrigin(origins = "*",allowedHeaders = "*")
@RestController
@RequestMapping(value="/products")
public class ProductoController {
	
	@GetMapping(value="/list")
	public ResponseEntity<?> listProducts() {
	    List<Producto> listaProductos = productoService.getAllProducts();

	    if (listaProductos.isEmpty()) {
	        Map<String, Object> res = new HashMap<>();
	        res.put("message", "No se encontraron productos para listar");
	        return ResponseEntity.ok(res);
	    }

	    Map<String, Object> res = new HashMap<>();
	    res.put("products", listaProductos);
	    res.put("message", "Productos listados correctamente");

	    return ResponseEntity.ok(res);
	}
	
	@Autowired
	private IProductoService productoService;
}
