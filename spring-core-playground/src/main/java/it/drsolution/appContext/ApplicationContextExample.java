package it.drsolution.appContext;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ApplicationContextExample {

	public static void main(String[] args) {
		/**
		 * ApplicationContext as heart of spring framework which contains BeanFactory + many other configuration
		 */
		ApplicationContext context = new AnnotationConfigApplicationContext(BeanConfig.class);
		TestBean testBean=(TestBean)context.getBean("testBean");
		testBean.printYourMessage();
		
	}

}
