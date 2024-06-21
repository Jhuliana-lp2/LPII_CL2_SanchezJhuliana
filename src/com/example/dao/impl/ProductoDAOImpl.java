package com.example.dao.impl;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;

import com.example.dao.ProductoDAO;
import com.example.model.Producto;

import java.util.List;

@Repository
public class ProductoDAOImpl implements ProductoDAO {
    @PersistenceContext
    private EntityManager em;

    @Override
    public void registrar(Producto producto) {
        em.persist(producto);
    }

    @Override
    public List<Producto> listar() {
        TypedQuery<Producto> query = em.createQuery("SELECT p FROM Producto p", Producto.class);
        return query.getResultList();
    }
}

