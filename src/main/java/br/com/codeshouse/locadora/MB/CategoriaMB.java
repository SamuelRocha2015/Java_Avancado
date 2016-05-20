package br.com.codeshouse.locadora.MB;

import br.com.codeshouse.locadora.modelo.Categoria;
import br.com.codeshouse.locadora.util.JPAUtil;
import javax.faces.bean.ManagedBean;
import javax.persistence.EntityManager;

@ManagedBean(name = "categoriaMB" )
public class CategoriaMB {

    private Categoria categoria = new Categoria();

    public void salvar() {
        JPAUtil jpa = new JPAUtil();
        EntityManager em = jpa.getEntityManager();
        
//        em.getTransaction().begin();
//        em.persist(this.categoria.getNome());
//        em.getTransaction().commit();
//        em.close();
        System.out.println("Cateogira " + this.categoria.getNome() + " Salva com sucesso!");
        this.categoria = new Categoria();
    }

    public Categoria getCategoria() {
        return categoria;
    }

}
