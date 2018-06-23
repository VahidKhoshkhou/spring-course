package it.drsolution.configSeperation;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import it.drsolution.repositories.StudentRepository;

@Configuration
public class RepositoryConfig {
	 @Bean
	   public StudentRepository studentRepositori() {
		   return new StudentRepository();
	   }

}
