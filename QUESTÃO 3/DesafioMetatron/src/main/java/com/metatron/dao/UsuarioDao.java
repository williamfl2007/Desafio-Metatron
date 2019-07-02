package com.metatron.dao;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class UsuarioDao  {
	
	@Autowired
    private SessionFactory sessionFactory;	
	
    @SuppressWarnings("rawtypes")
	public List getUsuarios(String nome,String cargo) {
    	Session session = sessionFactory.openSession();   	
    	
        List listaUsuarios = new ArrayList();        
        try {         	          
        	session.beginTransaction(); 
            String hql = "SELECT u.nome,c.nome cargo,t.numero telefone FROM Usuario u "
            		+ " join u.cargo as c"
            		+ " join u.telefones as t "
            		+ " where u.nome=:nome or c.nome=:cargo ";
            listaUsuarios = session.createQuery(hql)
            		.setParameter("nome", nome)
            		.setParameter("cargo", cargo)
            		.list();
        } catch(Exception sqlException) {
            if(null != session.getTransaction()) {          
            	session.getTransaction().rollback();
            }
            sqlException.printStackTrace();
        } finally {
            if(session != null) {
            	session.close();
            }
        }
        return listaUsuarios;
    }

}
