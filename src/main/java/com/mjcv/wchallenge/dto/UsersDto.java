/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mjcv.wchallenge.dto;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 *
 * @author Manuel Camargo
 */
@Data
public class UsersDto implements Serializable{
    private String id_usuario;
    private String identificacion;
    private String nombre;    
    private String email;
    private String clave;
    private Date fecha_creacion;
}
