/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.blAlberto.meteoGalicia.Estacion;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author Alberto
 */
@Controller
@RequestMapping("/estacions/")
public class EstacionController {
    
    // views
    private static final String ESTACIONS_LIST = "estacion/estacion-list";
    
    // services
    private final EstacionService estacionService;
    
    public EstacionController(EstacionService estacionService) {
        this.estacionService = estacionService;
    }
    
    @RequestMapping("/")
    public String estacionsList() {
        
        
        return ESTACIONS_LIST;
    }
    
}
