/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mjcv.wchallenge.controller;

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
@RequestMapping("/")
public class ApiController {
    
    @GetMapping("example")
    public ResponseEntity<Object> index(){
        return ResponseEntity.ok("OK");
    
    }
}
