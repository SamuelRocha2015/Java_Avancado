/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.codeshouse.locadora.teste;

import br.com.codeshouse.locadora.modelo.Categoria;
import br.com.codeshouse.locadora.util.JPAUtil;
import javax.persistence.EntityManager;

/**
 *
 * @author samuel.rocha
 */
public class Testa {

    public static void main(String[] args) {
        
        EntityManager em = JPAUtil.getEntityManager();

        Categoria c = new Categoria();
        c.setNome("suspense");

        em.getTransaction().begin();
        em.persist(c);
        em.getTransaction().commit();
        em.close();
    }

}
