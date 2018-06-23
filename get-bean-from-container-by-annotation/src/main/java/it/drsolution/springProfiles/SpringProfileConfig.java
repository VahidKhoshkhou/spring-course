package it.drsolution.springProfiles;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;

import it.drsolution.model.TestBean;

@Configuration
@PropertySource("classpath:/application.properties")
public class SpringProfileConfig {
   
	@Value("${test.name}")
	private String name;
	
	/**
	 * It will be injected if an evironment variable :
	 *  spring.profiles.active=dev
	 * 
	 */
   @Bean
   @Profile("dev")
   public TestBean testBeanDev() {
	   return new TestBean(name,"this bean is for your \"DEV\" environment");
   }
   
	/**
	 * It will be injected if an evironment variable :
	 *  spring.profiles.active=prod
	 * 
	 */
   @Bean
   @Profile("prod")
   public TestBean testBeanProd() {
	   return new TestBean(name," this bean is for your \"Prod\" environment ");
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
