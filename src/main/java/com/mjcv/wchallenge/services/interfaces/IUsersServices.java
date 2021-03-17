/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mjcv.wchallenge.services.interfaces;

import com.mjcv.wchallenge.dto.UsersDto;
import java.util.List;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;

/**
 *
 * @author Manuel Camargo
 */
@Service
public interface IUsersServices {
    Page<UsersDto> findAll();
    
    UsersDto findName(String nombre);
    
    UsersDto findByIdUsuario(String nombre);
    
    void save(UsersDto user);
    
    void saveAll(List<UsersDto> users);
    
    void deleteById(String id_usuario);
}
