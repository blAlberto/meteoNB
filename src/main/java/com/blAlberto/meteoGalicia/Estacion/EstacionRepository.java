/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.blAlberto.meteoGalicia.Estacion;

import com.blAlberto.meteoGalicia.Provincia.Provincia;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Alberto
 */

@Repository
public interface EstacionRepository extends JpaRepository<Estacion, Integer> {
    
    public List<Estacion> findByProvincia(Provincia provincia);
}
