package com.mercadolibre_carrito.repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.mercadolibre_carrito.models.Carrito;

@Repository
public class CarritoRepository {

  private Map<Long, Carrito> carritos = new HashMap<>();

  public Carrito findByUserId(Long userId) {
    return carritos.get(userId);
  }

  public List<Carrito> findAll() {
    return new ArrayList<>(carritos.values());
  }

  public Carrito save(Carrito carrito) {
    carritos.put(carrito.getUserId(), carrito);
    return carrito;
  }
}
