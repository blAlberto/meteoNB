/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.blAlberto.meteoGalicia.Estacion;

import java.util.List;
import org.springframework.stereotype.Service;

@Service
public class EstacionServiceImpl implements EstacionService {

    private final EstacionRepository estacionRepository;

    public EstacionServiceImpl (EstacionRepository estacionRepository) {
        this.estacionRepository = estacionRepository;
    }

    public List<Estacion> getEstacionsByProvinciaId (Integer idProvincia) {
        return estacionRepository.findByProvinciaId(idProvincia);
    }

    @Override
    public Estacion guardar (Estacion estacion) {
        return (Estacion) estacionRepository.save(estacion);
    }

    @Override
    public Estacion getEstacionById (Integer id) {
        return estacionRepository.getOne(id);
    }

    @Override
    public List<Estacion> getAll () {
        return estacionRepository.findAllByOrderByProvinciaIdAscNomeAsc();
    }

    @Override
    public void borrarEstacionConId (Integer id) {
        estacionRepository.deleteById(id);
    }

}
