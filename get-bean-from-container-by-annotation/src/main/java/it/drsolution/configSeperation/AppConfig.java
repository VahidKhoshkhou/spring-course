package it.drsolution.configSeperation;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

import it.drsolution.repositories.StudentRepository;
import it.drsolution.services.StudentService;

@Configuration
@Import(value=RepositoryConfig.class)
public class AppConfig {
   
	/**
	 *  StudentRepository will be injected automatically by spring framework
	 *  
	 * @param studentRepository
	 * @return
	 */
	
   @Bean
   public StudentService studentService(StudentRepository studentRepository) {
	   return new StudentService(studentRepository);
   }
   
  
}
