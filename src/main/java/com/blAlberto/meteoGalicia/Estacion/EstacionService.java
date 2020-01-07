/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.blAlberto.meteoGalicia.Estacion;

import java.util.List;
import org.springframework.stereotype.Service;

/**
 *
 * @author Alberto
 */
@Service
public interface EstacionService {

    List<Estacion> getEstacionsByProvinciaId (Integer idProvincia);

    Estacion guardar (Estacion estacion);

    Estacion getEstacionById (Integer id);

    public List<Estacion> getAll ();

    public void borrarEstacionConId (Integer id);
}
