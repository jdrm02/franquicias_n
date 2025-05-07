package com.mycompany.Franquicias.controller;

import com.mycompany.Franquicias.model.Producto;
import com.mycompany.Franquicias.service.ProductoService;
import org.springframework.web.bind.annotation.*;

//import java.util.List;

@RestController
@RequestMapping("/productos")
public class ProductoController {

    private final ProductoService productoService;

    public ProductoController(ProductoService productoService) {
        this.productoService = productoService;
    }

    @PostMapping("/sucursal/{sucursalId}")
    public Producto agregarProducto(@PathVariable Long sucursalId, @RequestBody Producto producto) {
        return productoService.agregarProducto(sucursalId, producto);
    }

    @DeleteMapping("/{id}")
    public void eliminarProducto(@PathVariable Long id) {
        productoService.eliminarProducto(id);
    }

    @PutMapping("/{id}/stock")
    public Producto actualizarStock(@PathVariable Long id, @RequestParam int stock) {
        return productoService.actualizarStock(id, stock);
    }

    @PutMapping("/{id}")
    public Producto actualizarNombre(@PathVariable Long id, @RequestParam String nombre) {
        return productoService.actualizarNombre(id, nombre);
    }

    /*@GetMapping("/franquicia/{franquiciaId}/top")
    public List<Producto> obtenerTopProductosPorFranquicia(@PathVariable Long franquiciaId) {
        return productoService.obtenerTopProductoPorSucursalDeFranquicia(franquiciaId);
    }*/
}
