package com.mycompany.Franquicias.service;

import com.mycompany.Franquicias.model.Franquicia;
import com.mycompany.Franquicias.model.Sucursal;
import com.mycompany.Franquicias.repository.SucursalRepository;
import org.springframework.stereotype.Service;

@Service
public class SucursalService {

    private final SucursalRepository sucursalRepository;
    private final FranquiciaService franquiciaService;

    public SucursalService(SucursalRepository sucursalRepository, FranquiciaService franquiciaService) {
        this.sucursalRepository = sucursalRepository;
        this.franquiciaService = franquiciaService;
    }

    public Sucursal agregarSucursal(Long franquiciaId, Sucursal sucursal) {
        Franquicia franquicia = franquiciaService.obtenerFranquiciaPorId(franquiciaId).orElseThrow(null);
        sucursal.setFranquicia(franquicia);
        return sucursalRepository.save(sucursal);
    }

    public Sucursal actualizarNombre(Long id, String nuevoNombre) {
        Sucursal sucursal = sucursalRepository.findById(id).orElseThrow(null);
        sucursal.setNombre(nuevoNombre);
        return sucursalRepository.save(sucursal);
    }
    
    public Sucursal consultarSucursalPorId(Long id) {
    	Sucursal consultaSucursal = sucursalRepository.findById(id).orElseThrow(null);
        return consultaSucursal;
    }
}
