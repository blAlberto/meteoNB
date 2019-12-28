/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.blAlberto.meteoGalicia.Estacion;

import java.util.List;
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

    public EstacionRestController(EstacionService estacionService) {
        this.estacionService = estacionService;
    }

    @RequestMapping("/lista")
    public List<Estacion> listarEstacions(@RequestParam(required = false) Integer idProvincia) {
        if (idProvincia == null) {
            return estacionService.obterEstacions();
        } else {
            return null;
        }
    }

}
