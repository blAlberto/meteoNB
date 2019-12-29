/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.blAlberto.meteoGalicia.Provincia;

import java.util.List;
import org.springframework.stereotype.Service;

@Service
public class ProvinciaServiceImpl implements ProvinciaService {

    ProvinciaRepository provinciaRepository;

    public ProvinciaServiceImpl (ProvinciaRepository provinciaRepository) {
        this.provinciaRepository = provinciaRepository;
    }

    @Override
    public List<Provincia> obterProvincias () {
        return this.provinciaRepository.findAll();
    }

}
