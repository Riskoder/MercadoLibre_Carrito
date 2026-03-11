package com.mercadolibre_carrito.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.mercadolibre_carrito.models.Carrito;
import com.mercadolibre_carrito.models.ProductoCarrito;
import com.mercadolibre_carrito.service.CarritoService;

@RestController
@RequestMapping("/carrito")
public class CarritoController {

    @Autowired
    private CarritoService carritoService;

    @GetMapping("/{userId}")
    public Carrito obtenerCarrito(@PathVariable Long userId) {
        return carritoService.obtenerCarrito(userId);
    }

    @PostMapping("/{userId}")
    public Carrito agregarProducto(
            @PathVariable Long userId,
            @RequestBody ProductoCarrito producto) {

        return carritoService.agregarProducto(userId, producto);
    }
}