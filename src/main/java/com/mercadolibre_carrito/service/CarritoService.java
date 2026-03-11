package com.mercadolibre_carrito.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mercadolibre_carrito.models.Carrito;
import com.mercadolibre_carrito.models.ProductoCarrito;
import com.mercadolibre_carrito.repository.CarritoRepository;

@Service
public class CarritoService {

    @Autowired
    private CarritoRepository carritoRepository;

    public Carrito obtenerCarrito(Long userId) {
        return carritoRepository.findByUserId(userId);
    }

    public Carrito agregarProducto(Long userId, ProductoCarrito producto) {

        Carrito carrito = carritoRepository.findByUserId(userId);

        if (carrito == null) {
            carrito = new Carrito();
            carrito.setUserId(userId);
            carrito.setProductos(new ArrayList<>());
        }

        carrito.getProductos().add(producto);

        return carritoRepository.save(carrito);
    }


    public void inicializarDatos() {

        ProductoCarrito p1 = new ProductoCarrito(101L, 2, 15000);
        ProductoCarrito p2 = new ProductoCarrito(102L, 1, 30000);

        Carrito carrito1 = new Carrito();
        carrito1.setId(1L);
        carrito1.setUserId(1L);

        ArrayList<ProductoCarrito> productos1 = new ArrayList<>();
        productos1.add(p1);
        productos1.add(p2);

        carrito1.setProductos(productos1);

        carritoRepository.save(carrito1);


        ProductoCarrito p3 = new ProductoCarrito(103L, 1, 20000);

        Carrito carrito2 = new Carrito();
        carrito2.setId(2L);
        carrito2.setUserId(2L);

        ArrayList<ProductoCarrito> productos2 = new ArrayList<>();
        productos2.add(p3);

        carrito2.setProductos(productos2);

        carritoRepository.save(carrito2);

        System.out.println("Carritos inicializados correctamente");
    }
}