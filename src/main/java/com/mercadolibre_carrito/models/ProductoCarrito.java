package com.mercadolibre_carrito.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ProductoCarrito {

  private Long id;
  private Long productoId;
  private Integer cantidad;
  private Integer precioUnitario;

}
