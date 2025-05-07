package com.mycompany.Franquicias.service;

import com.mycompany.Franquicias.model.Franquicia;
import com.mycompany.Franquicias.repository.FranquiciaRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class FranquiciaService {

    private final FranquiciaRepository franquiciaRepository;

    public FranquiciaService(FranquiciaRepository franquiciaRepository) {
        this.franquiciaRepository = franquiciaRepository;
    }

    public Franquicia crearFranquicia(Franquicia franquicia) {
        return franquiciaRepository.save(franquicia);
    }

    public Optional<Franquicia> obtenerFranquiciaPorId(Long id) {
        return franquiciaRepository.findById(id);
    }
    
    public Franquicia consultarFranquiciaPorId(Long id) {
    	Franquicia consultaFranquicia = franquiciaRepository.findById(id).orElseThrow(null);
        return consultaFranquicia;
    }

    public Franquicia actualizarNombre(Long id, String nuevoNombre) {
        Franquicia franquicia = franquiciaRepository.findById(id).orElseThrow(null);
        franquicia.setNombre(nuevoNombre);
        return franquiciaRepository.save(franquicia);
    }
}
