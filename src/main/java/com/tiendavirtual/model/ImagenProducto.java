package com.tiendavirtual.model;

import com.fasterxml.jackson.annotation.JsonBackReference;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name="image_producto")
public class ImagenProducto {
	@Id()
	@Column(name = "id_image_producto")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int id;
	
	@Column(name = "url_image_producto")
	String urlImagen;
	
	@ManyToOne
    @JoinColumn(name = "id_producto")
	@JsonBackReference
	Producto producto;
}
