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
    public List<Estacion> obterEstacions();

}
