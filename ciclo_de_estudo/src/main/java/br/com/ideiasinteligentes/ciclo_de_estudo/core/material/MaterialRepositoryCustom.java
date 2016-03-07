package br.com.ideiasinteligentes.ciclo_de_estudo.core.material;

public interface MaterialRepositoryCustom {

	Material findById(Long idMaterial, Long idUsuario);
	Iterable<Material> listaMateriaisPorCicloEMeta(Long idCiclo, Long idMeta, Long idAluno);
	
}
