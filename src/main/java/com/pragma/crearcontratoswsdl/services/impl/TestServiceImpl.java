/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pragma.crearcontratoswsdl.services.impl;

import com.pragma.crearcontratoswsdl.dao.TestDao;
import com.pragma.crearcontratoswsdl.entity.Test;
import com.pragma.crearcontratoswsdl.services.TestService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author cesar.rodriguez
 */
@Service
public class TestServiceImpl implements TestService{

    @Autowired
    TestDao testDao;
    
    @Override
    public List<Test> getAllTest() {
        
        return testDao.getAll();
    }

    @Override
    public Integer saveTest(Test test) {
        return (Integer) testDao.save(test);
    }
}
