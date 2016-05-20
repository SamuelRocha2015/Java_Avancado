/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.codeshouse.locadora.teste;

import br.com.codeshouse.locadora.modelo.Categoria;
import br.com.codeshouse.locadora.util.JPAUtil;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;

/**
 *
 * @author samuel.rocha
 */
public class Testa {

    public static void main(String[] args) {

        EntityManager em = JPAUtil.getEntityManager();
        em.getTransaction().begin();
        
        Query q = em.createQuery("select c from Categoria c", Categoria.class);
        Query q2 = em.createNativeQuery("select * from tbl_categoria");
        List<Categoria> lista = q.getResultList();
        
        em.getTransaction().commit();
        em.close();
        
        
        System.err.println("=====================================================");
        for (Categoria categoria : lista) {
            System.out.println("categoria : " + categoria.getNome());
        }
    }

}
