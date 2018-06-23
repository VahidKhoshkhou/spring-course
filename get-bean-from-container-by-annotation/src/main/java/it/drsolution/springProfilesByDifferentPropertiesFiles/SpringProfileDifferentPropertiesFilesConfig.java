package it.drsolution.springProfilesByDifferentPropertiesFiles;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import it.drsolution.model.TestBean;

@Configuration
@PropertySource("classpath:/application-${spring.profiles.active}.properties")
public class SpringProfileDifferentPropertiesFilesConfig {
   
	@Value("${test.name}")
	private String name;
	@Value("${test.message}")
	private String message;
	

	
	/**
	 * It will be injected if an evironment variable :
	 *  spring.profiles.active=dev
	 * 
	 */
   @Bean
   public TestBean testBean() {
	   return new TestBean(name,message);
   }
   
	
   
   /**
    * To resolve ${} in Spring @Value, you need to declare a STATIC PropertySourcesPlaceholderConfigurer bean manually
    * 
    * @return
    */
   @Bean
	public static PropertySourcesPlaceholderConfigurer propertyConfigInDev() {
		return new PropertySourcesPlaceholderConfigurer();
	}
}
