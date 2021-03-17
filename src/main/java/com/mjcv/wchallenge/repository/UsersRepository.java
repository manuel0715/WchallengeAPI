/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mjcv.wchallenge.repository;

import com.mjcv.wchallenge.entities.Users;
import java.util.Optional;
import org.springframework.data.domain.Page;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author Manuel Camargo
 */
@Repository
public interface UsersRepository extends CrudRepository<Users, String>{
    
    @Transactional(readOnly = true)
    Optional<Users> findbyNombre(String id_usuario);
    
    @Override
    Page<Users> findAll();

    public void deleteById(int id_usuario);
}
