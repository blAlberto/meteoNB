/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.blAlberto.meteoGalicia.Provincia;

import com.blAlberto.meteoGalicia.Estacion.Estacion;
import com.blAlberto.meteoGalicia.Estacion.EstacionService;
import java.util.List;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
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
    public ResponseEntity<List<Provincia>> obterProvinciasResponse () {
        return new ResponseEntity<List<Provincia>>(this.provinciaService.obterProvincias(), HttpStatus.OK);
    }

    @RequestMapping("/{idProvincia}/estacions")
    @ResponseBody
    public List<Estacion> obterEstacionsProvincia (@PathVariable Integer idProvincia) {
        List<Estacion> estacions = this.estacionService.getEstacionsByProvinciaId(idProvincia);
        return estacions;
    }

    @PostMapping("/{idProvincia}/estacions/nova")
    public ResponseEntity<Estacion> novaEstacion (@RequestBody Estacion estacion, @PathVariable("idProvincia") Integer idProvincia) {

        return new ResponseEntity<>(estacion, HttpStatus.OK);
    }
}
