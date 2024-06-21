<!DOCTYPE html>
<html>
<head>
    <title>Productos</title>
</head>
<body>
    <h1>Registrar Producto</h1>
    <form action="ProductoServlet" method="post">
        <label for="nombre">Nombre:</label>
        <input type="text" id="nombre" name="nombre">
        <label for="precioVenta">Precio Venta:</label>
        <input type="text" id="precioVenta" name="precioVenta">
        <label for="precioCompra">Precio Compra:</label>
        <input type="text" id="precioCompra" name="precioCompra">
        <label for="estado">Estado:</label>
        <input type="text" id="estado" name="estado">
        <label for="descripcion">Descripción:</label>
        <input type="text" id="descripcion" name="descripcion">
        <button type="submit">Registrar</button>
    </form>

    <h1>Lista de Productos</h1>
    <ul>
        <c:forEach var="producto" items="${productos}">
            <li>${producto.nombre} - ${producto.precioVenta}</li>
        </c:forEach>
    </ul>
</body>
</html>