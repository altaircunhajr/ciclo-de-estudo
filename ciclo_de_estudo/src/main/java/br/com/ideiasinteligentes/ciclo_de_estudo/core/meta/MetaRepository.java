package br.com.ideiasinteligentes.ciclo_de_estudo.core.meta;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MetaRepository extends CrudRepository<Meta, Long>, MetaRepositoryCustom {

}
