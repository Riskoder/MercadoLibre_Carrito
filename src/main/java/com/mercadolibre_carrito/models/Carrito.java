package com.mercadolibre_carrito.models;

import java.util.ArrayList;
import java.util.List;

import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Carrito {

  private Long id;
  private Long userId;

  private List<ProductoCarrito> productos = new ArrayList<>();
}
