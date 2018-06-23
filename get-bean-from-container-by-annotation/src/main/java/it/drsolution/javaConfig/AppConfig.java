package it.drsolution.javaConfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import it.drsolution.repositories.StudentRepository;
import it.drsolution.services.StudentService;

@Configuration
public class AppConfig {
  
	
   @Bean
   public StudentService studentService(StudentRepository studentRepository) {
	   return new StudentService(studentRepository);
   }
   
   @Bean
   public StudentRepository studentRepositori() {
	   return new StudentRepository();
   }
}
