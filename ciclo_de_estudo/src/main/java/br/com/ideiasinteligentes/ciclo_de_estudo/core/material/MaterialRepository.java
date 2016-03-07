package br.com.ideiasinteligentes.ciclo_de_estudo.core.material;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MaterialRepository extends CrudRepository<Material, Long>, MaterialRepositoryCustom {

}
