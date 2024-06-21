package com.example.dao;

import com.example.model.Producto;
import java.util.List;

public interface ProductoDAO {
    void registrar(Producto producto);
    List<Producto> listar();
}