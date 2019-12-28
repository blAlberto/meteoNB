/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.blAlberto.meteoGalicia.Estacion;

import com.blAlberto.meteoGalicia.Provincia.Provincia;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import lombok.Getter;
import lombok.Setter;

/**
 *
 * @author Alberto
 */
@Entity
@Getter
@Setter
public class Estacion {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer _id;
    private String nome;
    private String concello;
    
    @ManyToOne(optional = false, fetch = FetchType.EAGER)
    @JoinColumn(name="idProvincia")
    private Provincia provincia;

}
