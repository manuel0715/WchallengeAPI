/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mjcv.wchallenge.entities;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.PrePersist;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import lombok.Data;

/**
 *
 * @author Manuel Camargo
 */
@Data
@Entity
@Table(name="usuarios")
public class Users implements Serializable {
    
    @Id
    @Column(name="id_usuario")
    private String id_usuario;
    @Column(name="identificacion")
    private String identificacion;
    @Column(name="nombre")
    private String nombre;
    @Column(name="email")        
    private String email;
    @Column(name="clave")
    private String clave;
    @Column(name="fecha_creacion")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fecha_creacion;
    
    @PrePersist
    public void prePersist(){
        this.fecha_creacion=new Date();
    }
    			
}
