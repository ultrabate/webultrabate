/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package beans;

import br.com.ultrabate.entidade.TbPessJur;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Denisio
 */
@Stateless
public class TbPessJurFacade extends AbstractFacade<TbPessJur> {
    @PersistenceContext(unitName = "AplicacaoWebPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public TbPessJurFacade() {
        super(TbPessJur.class);
    }
    
}
