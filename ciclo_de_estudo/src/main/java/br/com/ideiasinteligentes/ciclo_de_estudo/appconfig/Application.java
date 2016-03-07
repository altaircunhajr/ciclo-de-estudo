package br.com.ideiasinteligentes.ciclo_de_estudo.appconfig;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.orm.jpa.EntityScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import br.com.ideiasinteligentes.ciclo_de_estudo.core.aluno.Aluno;
import br.com.ideiasinteligentes.ciclo_de_estudo.core.aluno.AlunoRepository;
import br.com.ideiasinteligentes.ciclo_de_estudo.core.ciclo.Ciclo;

@SpringBootApplication
@EntityScan("br.com.ideiasinteligentes")
@ComponentScan(basePackages = {"br.com.ideiasinteligentes"})
@EnableJpaRepositories(basePackages = {"br.com.ideiasinteligentes"})
public class Application {

	private static final Logger log = LoggerFactory.getLogger(Application.class);
	
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	@Bean
	public CommandLineRunner demo(AlunoRepository alunoRepository){
		
		return (args) -> {
			
			// Criando e salvando alunos
			Aluno altair = new Aluno("Altair", "altair.cunha.jr@gmail.com");
			altair.novoCiclo(new Ciclo());
			alunoRepository.save(altair);
			alunoRepository.save(new Aluno("Urias", "urias@gmail.com"));
			
			
			// Recuperando os alunos criados
			log.info("Todos os alunos:");
			log.info("......");
			for(Aluno aluno : alunoRepository.findAll()) {
				log.info(aluno.toString());
			}
			log.info("");
			
			// Recuperando aluno por Id
			log.info("Aluno por ID 1L");
			log.info("....");
			Aluno aluno = alunoRepository.findOne(1L);
			log.info(aluno.toString());
			
		};
		
	}
	
}
