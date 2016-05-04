/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.codeshouse.locadora.teste;

import br.com.codeshouse.locadora.modelo.Categoria;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author samuel.rocha
 */
public class Testa {

    public static void main(String[] args) {
        EntityManagerFactory factory = Persistence.createEntityManagerFactory("LocadoraPU");
        EntityManager em = factory.createEntityManager();

        Categoria c = new Categoria();
        c.setCategoria("suspense");

        em.getTransaction().begin();
        em.persist(c);
        em.getTransaction().commit();
        em.close();
    }

}
