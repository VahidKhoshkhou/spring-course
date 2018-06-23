package it.drsolution.appContext;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import it.drsolution.model.TestBean;

@Configuration
public class BeanConfig {
  
	
   @Bean
   public TestBean testBean() {
	   return new TestBean("This is just a test bean");
   }
}
