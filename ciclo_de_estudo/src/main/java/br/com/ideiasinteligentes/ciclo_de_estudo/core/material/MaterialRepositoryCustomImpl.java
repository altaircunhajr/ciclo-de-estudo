package br.com.ideiasinteligentes.ciclo_de_estudo.core.material;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

public class MaterialRepositoryCustomImpl implements MaterialRepositoryCustom {

	@PersistenceContext
	EntityManager em;

	@Override
	public Iterable<Material> listaMateriaisPorCicloEMeta(Long idCiclo, Long idMeta, Long idAluno) {
		return em.createQuery("from Material m where m.meta.id = :idMeta and m.meta.ciclo.id = :idCiclo and m.aluno.id = :idAluno", Material.class)
				.setParameter("idCiclo", idCiclo)
				.setParameter("idMeta", idMeta)
				.setParameter("idUsuario", idAluno)
				.getResultList();
	}

	@Override
	public Material findById(Long idMaterial, Long idAluno) {
		return em.createQuery("from Material m where m.id = :idMaterial and m.aluno = :idUsuario", Material.class)
				.setParameter("idMaterial", idMaterial)
				.setParameter("idUsuario", idAluno)
				.getSingleResult();
	}

}
