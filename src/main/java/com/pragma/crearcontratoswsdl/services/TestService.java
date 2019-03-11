/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pragma.crearcontratoswsdl.services;

import com.pragma.crearcontratoswsdl.entity.Test;
import java.util.List;

/**
 *
 * @author cesar.rodriguez
 */
public interface TestService {
    
    List<Test> getAllTest();
    Integer saveTest(Test test);
    
}
