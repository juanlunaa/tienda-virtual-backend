package com.tiendavirtual.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.tiendavirtual.model.Producto;

@Repository
public interface ProductoRepository extends CrudRepository<Producto, Integer>{
	
}
