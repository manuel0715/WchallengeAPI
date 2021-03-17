/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mjcv.wchallenge.dto;

import java.util.Date;
import lombok.Data;

/**
 *
 * @author Manuel Camargo
 */
@Data
public class UsersDto {
    private int id_usuario;
    private int identificacion;
    private int nombre;    
    private int email;
    private String clave;
    private Date fecha_creacion;
}
