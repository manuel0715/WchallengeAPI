/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mjcv.wchallenge.services.inmplementation;

import com.mjcv.wchallenge.dto.UsersDto;
import com.mjcv.wchallenge.entities.Users;
import com.mjcv.wchallenge.repository.UsersRepository;
import com.mjcv.wchallenge.services.interfaces.IUsersServices;
import com.mjcv.wchallenge.utils.MHelpers;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 *
 * @author Manuel Camargo
 */
@Component
public class UsersImpl implements IUsersServices{

    @Autowired
    private UsersRepository userRepository;
    
    @Override
    public List<UsersDto> findAll() {
        
        List<UsersDto> dto =new ArrayList<>();
        Iterable<Users> users =this.userRepository.findAll();
        
        for (Users user : users) {
            UsersDto userDto =MHelpers.modelMapper().map(user, UsersDto.class);
            
            dto.add(userDto);
        }
        
        return dto;
    }    

    @Override
    public UsersDto findName(String nombre) {
        
        Optional<Users> users = this.userRepository.findbyNombre(nombre);
        
        if(!users.isPresent()){
            return null;
        }
        
        return MHelpers.modelMapper().map(users.get(), UsersDto.class);
        
    }
    
    @Override
    public UsersDto findByIdUsuario(String idUsuario) {
        
       Optional<Users> users = this.userRepository.findById(idUsuario);
       
       if(!users.isPresent()){
            return null;
        }
        
        return MHelpers.modelMapper().map(users.get(), UsersDto.class);
    }

    @Override
    public void save(UsersDto user) {
        Users users = MHelpers.modelMapper().map(user, Users.class);
      this.userRepository.save(users);
    }

    @Override
    public void saveAll(List<UsersDto> users) {
        
        List<Users> u=new ArrayList<>();
        
        users.forEach(user -> {
            
            Users us =MHelpers.modelMapper().map(user, Users.class);
            
            u.add(us);
        });
        
        this.userRepository.saveAll(u);
    
    }

    @Override
    public void deleteById(String id_usuario) {
        this.userRepository.deleteById(id_usuario);
    }
    
    private UsersDto convertToUsersDto(final Users user){
        return MHelpers.modelMapper().map(user, UsersDto.class);
        
    }
   
}
