/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pragma.crearcontratoswsdl.controllers;

import com.pragma.crearcontratoswsdl.entity.Test;
import com.pragma.crearcontratoswsdl.services.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author cesar.rodriguez
 */
@RestController
@RequestMapping("/test")
public class TestController {
    
    @Autowired
    TestService testService;
    
    @RequestMapping(value = "", method = RequestMethod.GET)
    public ResponseEntity<?> findAll(Test test){
        return ResponseEntity.ok(testService.getAllTest());
        
    }
    
    @RequestMapping(value = "", method = {RequestMethod.POST})
    public ResponseEntity<?> create(@RequestBody Test test) {
        try {
            return ResponseEntity.ok(testService.saveTest(test));
        } catch (Exception e) {
            return ResponseEntity.badRequest().build();
            
        }
    }
    
    
}
