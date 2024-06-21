package com.example.controller;

import com.example.dao.ProductoDAO;
import com.example.model.Producto;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.context.support.SpringBeanAutowiringSupport;
import java.io.IOException;
import java.util.List;

@WebServlet("/ProductoServlet")
public class ProductoServlet extends HttpServlet {
    @Autowired
    private ProductoDAO productoDAO;

    @Override
    public void init() {
        SpringBeanAutowiringSupport.processInjectionBasedOnCurrentContext(this);
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String nombre = request.getParameter("nombre");
        double precioVenta = Double.parseDouble(request.getParameter("precioVenta"));
        double precioCompra = Double.parseDouble(request.getParameter("precioCompra"));
        String estado = request.getParameter("estado");
        String descripcion = request.getParameter("descripcion");

        Producto producto = new Producto();
        producto.setNombre(nombre);
        producto.setPrecioVenta(precioVenta);
        producto.setPrecioCompra(precioCompra);
        producto.setEstado(estado);
        producto.setDescripcion(descripcion);

        productoDAO.registrar(producto);
        response.sendRedirect("productos.jsp");
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<Producto> productos = productoDAO.listar();
        request.setAttribute("productos", productos);
        request.getRequestDispatcher("productos.jsp").forward(request, response);
    }
}
