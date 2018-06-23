package it.drsolution.propertiesInjection;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;

import it.drsolution.model.TestBean;

@Configuration
@PropertySource("classpath:/application.properties")
public class propertiesInjectionConfig {
   
	/**
	 * It will be injected from properties file
	 * note; the priority is by environment variable
	 *  look at environment variable "test.name"
	 */
	@Value("${test.name}")
	private String name;
	
   @Bean
   public TestBean testBean() {
	   return new TestBean(name,"This is just a test bean");
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
