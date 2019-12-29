/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.blAlberto.meteoGalicia.Provincia;

import com.blAlberto.meteoGalicia.Estacion.Estacion;
import com.blAlberto.meteoGalicia.Estacion.EstacionService;
import java.util.List;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author A
 */
@RestController
@RequestMapping("/rest/provincia")
public class ProvinciaRestController {

    EstacionService estacionService;
    ProvinciaService provinciaService;

    public ProvinciaRestController (EstacionService estacionService, ProvinciaService provinciaService) {
        this.estacionService = estacionService;
        this.provinciaService = provinciaService;
    }

    @RequestMapping("/")
    public List<Provincia> obterProvincias () {
        return this.provinciaService.obterProvincias();
    }

    @RequestMapping("/{idProvincia}/estacions")
    @ResponseBody
    public List<Estacion> obterEstacionsProvincia (@PathVariable Integer idProvincia) {
        List<Estacion> estacions = this.estacionService.getEstacionsByProvinciaId(idProvincia);
        return estacions;
    }
}
