/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mjcv.wchallenge.controller;

import com.mjcv.wchallenge.services.interfaces.IUsersServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Manuel Camargo
 */
@CrossOrigin("*")
@RestController
@RequestMapping("/users")
public class ApiController {
    @Autowired
    private IUsersServices userServices;
    @GetMapping(value = "/all",produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Object> index(){
        
        return ResponseEntity.ok(this.userServices.findAll());
    
    }
}
