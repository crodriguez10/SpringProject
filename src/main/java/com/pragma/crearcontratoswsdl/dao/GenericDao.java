/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pragma.crearcontratoswsdl.dao;

import java.io.Serializable;
import java.util.List;

/**
 *
 * @author cesar.rodriguez
 */
public interface GenericDao<E> {
 
    Serializable save(E entity);
    
    List<E> getAll();
    
    E findById( Serializable id );
}
