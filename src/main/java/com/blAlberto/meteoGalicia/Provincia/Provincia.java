/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.blAlberto.meteoGalicia.Provincia;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Getter;
import lombok.Setter;

/**
 *
 * @author Alberto
 */
@Entity
@Getter
@Setter
public class Provincia {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer _id;
    private String nome;
    
}
