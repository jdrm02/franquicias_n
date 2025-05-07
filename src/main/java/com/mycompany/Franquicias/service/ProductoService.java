package com.mycompany.Franquicias.service;

import com.mycompany.Franquicias.model.Producto;
import com.mycompany.Franquicias.model.Sucursal;
import com.mycompany.Franquicias.repository.ProductoRepository;
import com.mycompany.Franquicias.repository.SucursalRepository;
import org.springframework.stereotype.Service;

//import java.util.Comparator;
//import java.util.List;

@Service
public class ProductoService {

    private final ProductoRepository productoRepository;
    private final SucursalRepository sucursalRepository;

    public ProductoService(ProductoRepository productoRepository, SucursalRepository sucursalRepository) {
        this.productoRepository = productoRepository;
        this.sucursalRepository = sucursalRepository;
    }

    public Producto agregarProducto(Long sucursalId, Producto producto) {
        Sucursal sucursal = sucursalRepository.findById(sucursalId).orElseThrow(null);
        producto.setSucursal(sucursal);
        return productoRepository.save(producto);
    }

    public void eliminarProducto(Long productoId) {
        productoRepository.deleteById(productoId);
    }

    public Producto actualizarStock(Long id, int nuevoStock) {
        Producto producto = productoRepository.findById(id).orElseThrow(null);
        producto.setStock(nuevoStock);
        return productoRepository.save(producto);
    }

    public Producto actualizarNombre(Long id, String nuevoNombre) {
        Producto producto = productoRepository.findById(id).orElseThrow(null);
        producto.setNombre(nuevoNombre);
        return productoRepository.save(producto);
    }

    /*public List<Producto> obtenerTopProductoPorSucursalDeFranquicia(Long franquiciaId) {
        List<Sucursal> sucursales = sucursalRepository.findAll();
        return sucursales.stream()
                .filter(s -> s.getFranquicia().getId().equals(franquiciaId))
                .map(sucursal -> productoRepository.findBySucursalId(sucursal.getId()).stream()
                        .max(Comparator.comparingInt(Producto::getStock))
                        .orElse(null))
                .filter(p -> p != null)
                .toList();
    }*/
}
