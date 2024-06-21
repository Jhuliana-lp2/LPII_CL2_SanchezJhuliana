package com.example.model;

import javax.persistence.*;

@Entity
@Table(name = "TBL_USUARIOCL2")

public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    
    @Column(name = "USUARIOCL2")
    private String usuario;
    
    @Column(name = "PASSWORDCL2")
    private String password;
    
   
}