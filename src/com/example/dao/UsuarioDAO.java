package com.example.dao;

import com.example.model.Usuario;

public interface UsuarioDAO {
    Usuario validar(String usuario, String password);
}