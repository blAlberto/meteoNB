/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.blAlberto.meteoGalicia.Estacion;

import com.blAlberto.meteoGalicia.Provincia.ProvinciaService;
import java.util.List;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
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

    @RequestMapping("/lista")
    public List<Estacion> listarEstacions (@RequestParam(required = true) Integer idProvincia) {

        return null;
    }

    @PostMapping("/nueva")
    public Estacion nuevaEstacion (@RequestBody Estacion estacion) {

        return null;
    }

}
