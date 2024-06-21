package com.example.model;

import javax.persistence.*;

	@Entity
	@Table(name = "TBL_PRODUCTOCL2")
	public class Producto {
	    @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private int id;
	    
	    @Column(name = "NOMBRECL2")
	    private String nombre;
	    
	    @Column(name = "PRECIOVENTACL2")
	    private double precioVenta;
	    
	    @Column(name = "PRECIOCOMPCL2")
	    private double precioCompra;
	    
	    @Column(name = "ESTADOCL2")
	    private String estado;
	    
	    @Column(name = "DESCRIPCL2")
	    private String descripcion;
	    
	}


