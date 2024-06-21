package com.tiendavirtual.services.imlpServices;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tiendavirtual.model.Producto;
import com.tiendavirtual.repository.ProductoRepository;
import com.tiendavirtual.services.IProductoService;

@Service
public class ProductoServiceImpl implements IProductoService{
	
	@Autowired
	private ProductoRepository productoRepository;

	@Override
	public void createProduct(Producto p) {
		productoRepository.save(p);	
	}

	@Override
	public Optional<Producto> getProduct(Integer id) {
		return productoRepository.findById(id);
	}

	@Override
	public List<Producto> getAllProducts() {
		return (List<Producto>) productoRepository.findAll();
	}

	@Override
	public void deleteProduct(int id) {
		productoRepository.deleteById(id);;
	}

	@Override
	public void updateProduct(Producto p) {
		// TODO Auto-generated method stub
	}

}
