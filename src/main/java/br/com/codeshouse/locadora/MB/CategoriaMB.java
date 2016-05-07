package br.com.codeshouse.locadora.MB;

import br.com.codeshouse.locadora.modelo.Categoria;
import br.com.codeshouse.locadora.util.JPAUtil;
import javax.faces.bean.ManagedBean;
import javax.persistence.EntityManager;

@ManagedBean
public class CategoriaMB {

    private final Categoria categoria = new Categoria();

    public void salvar() {
        EntityManager em = JPAUtil.getEntityManager();
        
        em.getTransaction().begin();
        em.persist(this.categoria.getNome());
        em.getTransaction().commit();
        em.close();
        System.out.println("Cateogira " + this.categoria.getNome() + " Salva com sucesso!");
    }

    public Categoria getCategoria() {
        return categoria;
    }

}
