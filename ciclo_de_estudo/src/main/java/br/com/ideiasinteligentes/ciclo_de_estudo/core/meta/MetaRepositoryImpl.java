package br.com.ideiasinteligentes.ciclo_de_estudo.core.meta;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

public class MetaRepositoryImpl implements MetaRepositoryCustom {

	@PersistenceContext
	EntityManager em;
	
	@Override
	public Iterable<Meta> listaMetasPorCiclo(Long idCiclo) {
		
		return em.createQuery("from Meta m where m.ciclo.id = :idCiclo", Meta.class)
				.setParameter("idCiclo", idCiclo)
				.getResultList();
	}
	
}
