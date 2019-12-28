/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.blAlberto.meteoGalicia.Provincia;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author Alberto
 */
public interface ProvinciaRepository extends JpaRepository<Provincia, Integer> {

    @Override
    public List<Provincia> findAll();
    
//    public List<Provincia> 
    
    
    
}
