/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.blAlberto.meteoGalicia.Estacion;

import com.blAlberto.meteoGalicia.Provincia.ProvinciaService;
import java.util.List;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Alberto
 */
@RestController
@RequestMapping("/rest/estacion")
public class EstacionRestController {

    EstacionService estacionService;
    ProvinciaService provinciaService;

    public EstacionRestController (EstacionService estacionService, ProvinciaService provinciaService) {
        this.estacionService = estacionService;
        this.provinciaService = provinciaService;
    }

    @RequestMapping("/{idProvincia}/lista")
    public List<Estacion> listarEstacions (@PathVariable Integer idProvincia) {
        return estacionService.getEstacionsByProvinciaId(idProvincia);
    }

    @PostMapping("/guardar")
    public Estacion nuevaEstacion (@RequestBody Estacion estacion) {
        return estacionService.guardar(estacion);
    }

}
