package com.example.dao.impl;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;

import com.example.dao.UsuarioDAO;
import com.example.model.Usuario;

@Repository
public class UsuarioDAOImpl implements UsuarioDAO {
    @PersistenceContext
    private EntityManager em;

    @Override
    public Usuario validar(String usuario, String password) {
        TypedQuery<Usuario> query = em.createQuery("SELECT u FROM Usuario u WHERE u.usuario = :usuario AND u.password = :password", Usuario.class);
        query.setParameter("usuario", usuario);
        query.setParameter("password", password);
        return query.getSingleResult();
    }
}