package br.com.ideiasinteligentes.ciclo_de_estudo.core.aluno;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AlunoRepository extends PagingAndSortingRepository<Aluno, Long> {

}
