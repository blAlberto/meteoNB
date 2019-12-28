/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.blAlberto.meteoGalicia.Estacion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public class EstacionServiceImpl implements EstacionService {

    private final EstacionRepository estacionRepository;

    public EstacionServiceImpl(EstacionRepository estacionRepository) {
        this.estacionRepository = estacionRepository;
    }
    
    @Override
    public List<Estacion> obterEstacions() {
        return estacionRepository.findAll();
    }
}
