package com.mycompany.Franquicias.controller;

import com.mycompany.Franquicias.model.Franquicia;
import com.mycompany.Franquicias.service.FranquiciaService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/franquicias")
public class FranquiciaController {

    private final FranquiciaService franquiciaService;

    public FranquiciaController(FranquiciaService franquiciaService) {
        this.franquiciaService = franquiciaService;
    }

    @PostMapping
    public Franquicia crearFranquicia(@RequestBody Franquicia franquicia) {
        return franquiciaService.crearFranquicia(franquicia);
    }

    @PutMapping("/{id}")
    public Franquicia actualizarNombre(@PathVariable Long id, @RequestParam String nombre) {
        return franquiciaService.actualizarNombre(id, nombre);
    }
    
    @GetMapping("/{id}")
    public Franquicia consultarFranquiciaPorId(@PathVariable Long id) {
        return franquiciaService.consultarFranquiciaPorId(id);
    }
}
