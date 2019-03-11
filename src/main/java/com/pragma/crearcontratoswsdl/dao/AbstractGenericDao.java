/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pragma.crearcontratoswsdl.dao;

import java.io.Serializable;
import java.lang.reflect.ParameterizedType;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author cesar.rodriguez
 */
@SuppressWarnings("unchecked")
public abstract class AbstractGenericDao<E> implements GenericDao<E>{
    
    //List<Object> getAll();
    
    //Object save(Object object);
    
    private final Class<E> entityClass;

    public AbstractGenericDao() {
            this.entityClass = (Class<E>) ((ParameterizedType) this.getClass().getGenericSuperclass())
                            .getActualTypeArguments()[0];
    }

    @Autowired
    private SessionFactory sessionFactory;

    protected Session getSession() {
            return this.sessionFactory.getCurrentSession();
    }

    @Override
    @Transactional(readOnly = true)
    public E findById(Serializable id){
        return (E) getSession().get(this.entityClass, id);
    }

    @Override
    @Transactional(readOnly = true)
    public List<E> getAll(){
        return getSession().createCriteria(this.entityClass).list();
    }

    @Override
    @Transactional
    public Serializable save(E entity){
        return getSession().save(entity);
    }
    
    
}
