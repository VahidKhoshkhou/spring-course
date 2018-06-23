package it.drsolution.springProfilesByDifferentPropertiesFiles;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import it.drsolution.model.TestBean;
import it.drsolution.services.StudentService;

public class SpringProfileDifferentPropertiesFilesExample {

	public static void main(String[] args) {
		/**
		 * ApplicationContext as heart of spring framework which contains BeanFactory + many other configuration
		 */
		ApplicationContext context = new AnnotationConfigApplicationContext(SpringProfileDifferentPropertiesFilesConfig.class);
		TestBean testBean=(TestBean)context.getBean(TestBean.class);
		testBean.printYourMessage();
	}

}
