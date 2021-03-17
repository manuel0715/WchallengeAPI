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
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
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
    public Page<UsersDto> findAll() {
        Page<Users> users =this.userRepository.findAll();
        
        return users.map(this::convertToUsersDto);
    }    

    @Override
    public UsersDto findName(String nombre) {
        
        Optional<Users> users = this.userRepository.findbyNombre(nombre);
        
        if(!users.isPresent()){
            return null;
        }
        
        return MHelpers.modelMapper().map(this.userRepository.findbyNombre(nombre), UsersDto.class);
        
    }

    @Override
    public void save(UsersDto user) {
        Users users = MHelpers.modelMapper().map(user, Users.class);
      this.userRepository.save(users);
    }

    @Override
    public void saveAll(List<UsersDto> users) {
    
    }

    @Override
    public void deleteById(int id_usuario) {
        this.userRepository.deleteById(id_usuario);
    }
    
    private UsersDto convertToUsersDto(final Users user){
        return MHelpers.modelMapper().map(user, UsersDto.class);
        
    }
}
