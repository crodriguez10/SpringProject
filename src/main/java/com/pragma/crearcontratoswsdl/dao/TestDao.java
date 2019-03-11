/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pragma.crearcontratoswsdl.dao;

import com.pragma.crearcontratoswsdl.entity.Test;

/**
 *
 * @author cesar.rodriguez
 */
public interface TestDao extends GenericDao<Test>{
    
    Integer countTest();
}
