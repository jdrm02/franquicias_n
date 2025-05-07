package com.mycompany.Franquicias.controller;

import com.mycompany.Franquicias.model.Franquicia;
import com.mycompany.Franquicias.model.Sucursal;
import com.mycompany.Franquicias.service.SucursalService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/sucursales")
public class SucursalController {

    private final SucursalService sucursalService;

    public SucursalController(SucursalService sucursalService) {
        this.sucursalService = sucursalService;
    }

    @PostMapping("/franquicia/{franquiciaId}")
    public Sucursal agregarSucursal(@PathVariable Long franquiciaId, @RequestBody Sucursal sucursal) {
        return sucursalService.agregarSucursal(franquiciaId, sucursal);
    }

    @PutMapping("/{id}")
    public Sucursal actualizarNombre(@PathVariable Long id, @RequestParam String nombre) {
        return sucursalService.actualizarNombre(id, nombre);
    }
    
    @GetMapping("/{id}")
    public Sucursal consultarSucursalPorId(@PathVariable Long id) {
        return sucursalService.consultarSucursalPorId(id);
    }
}
