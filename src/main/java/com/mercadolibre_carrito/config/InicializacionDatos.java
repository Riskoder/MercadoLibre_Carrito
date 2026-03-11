package com.mercadolibre_carrito.config;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.mercadolibre_carrito.service.CarritoService;

@Configuration
public class InicializacionDatos {

    @Bean
    CommandLineRunner init(CarritoService carritoService) {
        return args -> {
            carritoService.inicializarDatos();
        };
    }
}