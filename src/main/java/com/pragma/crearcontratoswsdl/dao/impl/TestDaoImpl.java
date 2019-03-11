/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pragma.crearcontratoswsdl.dao.impl;

import com.pragma.crearcontratoswsdl.dao.AbstractGenericDao;
import com.pragma.crearcontratoswsdl.dao.TestDao;
import com.pragma.crearcontratoswsdl.entity.Test;
import org.springframework.stereotype.Repository;

/**
 *
 * @author cesar.rodriguez
 */

@Repository
public class TestDaoImpl extends AbstractGenericDao<Test> implements TestDao{

    /*@Autowired
    private SessionFactory sessionFactory;
 
    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }*/
    
    /*@Override
    @Transactional(readOnly = true)
    public List<Test> getAllTest() {
        return sessionFactory.getCurrentSession().createQuery("from Test").list();
    }

    @Override
    @Transactional
    public Integer saveTest(Test test) {
    
        return (Integer) sessionFactory.getCurrentSession().save(test);
       
    
    }*/

    @Override
    public Integer countTest() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
