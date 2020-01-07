/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.blAlberto.meteoGalicia.Estacion;

import com.blAlberto.meteoGalicia.Provincia.ProvinciaService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author Alberto
 */
@Controller
@RequestMapping("/estacion")
public class EstacionController {

    // views
    private static final String ESTACIONS_LIST = "estacion/estacion-list";
    private static final String ESTACION_DETAIL = "estacion/estacion-detail";

    //moldelAttributes
    private static final String ESTACION = "estacion";
    private static final String ESTACIONS = "estacions";
    private static final String PROVINCIAS = "provincias";

    // services
    private final EstacionService estacionService;
    private final ProvinciaService provinciaService;

    public EstacionController (EstacionService estacionService, ProvinciaService provinciaService) {
        this.estacionService = estacionService;
        this.provinciaService = provinciaService;
    }

    @RequestMapping("/")
    public String estacionsList (Model model) {
        model.addAttribute(ESTACIONS, estacionService.getAll());
        return ESTACIONS_LIST;
    }

    @GetMapping("/{id}/detalle")
    public String estacionDetail (@PathVariable Integer id, Model model) {
        model.addAttribute(estacionService.getEstacionById(id));
        addAttributesDetail(model);
        return ESTACION_DETAIL;
    }

    @GetMapping("/nueva")
    public String formNuevaProvincia (Model model) {
        model.addAttribute(ESTACION, new Estacion());
        addAttributesDetail(model);
        return ESTACION_DETAIL;
    }

    private void addAttributesDetail (Model model) {
        model.addAttribute(PROVINCIAS, provinciaService.obterProvincias());
    }

    @PostMapping("/guardar")
    public String guardarNueva (@ModelAttribute Estacion estacion, ModelMap model) {
        Estacion nueva = estacionService.guardar(estacion);
        return "redirect:/estacion/" + nueva.getId() + "/detalle";
    }

    @GetMapping("/{id}/borrar")
    public String borrar (@PathVariable Integer id) {
        estacionService.borrarEstacionConId(id);
        return "redirect:/estacion/";
    }
}
