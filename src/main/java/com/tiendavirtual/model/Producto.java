package com.tiendavirtual.model;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name="producto")
public class Producto {
	@Id()
	@Column(name="id_producto")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int id;
	
	@Column(name="nombre_producto")
	String nombre;
	
	@Column(name="descripcion_producto")
	String descripcion;
	
	@Column(name="marca_producto")
	String marca;
	
	@Column(name="precio_producto")
	float precio;
	
	@Column(name="num_unidades_producto")
	int numeroUnidades;
	
	@Column(name="miniatura_producto")
	String miniatura;
	
	@OneToMany(mappedBy = "producto", cascade = CascadeType.ALL, orphanRemoval = true)
	@JsonManagedReference
	List<ImagenProducto> imagenes;
}
