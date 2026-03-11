package com.mercadolibre_carrito.service;

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
        }

        carrito.getProductos().add(producto);

        return carritoRepository.save(carrito);
    }
}