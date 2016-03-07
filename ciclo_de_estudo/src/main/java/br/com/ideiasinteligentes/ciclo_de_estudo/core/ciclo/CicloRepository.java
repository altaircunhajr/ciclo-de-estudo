package br.com.ideiasinteligentes.ciclo_de_estudo.core.ciclo;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CicloRepository extends PagingAndSortingRepository<Ciclo, Long> {

}
