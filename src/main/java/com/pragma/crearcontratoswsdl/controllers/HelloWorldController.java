/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pragma.crearcontratoswsdl.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author cesar.rodriguez
 */
@Controller
public class HelloWorldController {
    
    @RequestMapping("/")
    public String index(){
        return "index";
    }
    
    @RequestMapping("/hello")
    public String hello(){
        return "hello";
    }
}
