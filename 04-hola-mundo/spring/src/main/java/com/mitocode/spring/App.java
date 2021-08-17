














package com.mitocode.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.mitocode.beans.AppConfig;
import com.mitocode.beans.AppConfig2;
import com.mitocode.beans.Mundo;

public class App {

	public static void main(String[] args) {
		
		
		//ApplicationContext appContext = new ClassPathXmlApplicationContext("com/mitocode/xml/beans.xml"); 
		//ApplicationContext appContext = new AnnotationConfigApplicationContext(AppConfig.class,AppConfig2.class);
		ApplicationContext appContext = new AnnotationConfigApplicationContext();
		((AnnotationConfigApplicationContext) appContext).register(AppConfig.class);
		((AnnotationConfigApplicationContext) appContext).register(AppConfig2.class);
		((AbstractApplicationContext) appContext).refresh();
		
		Mundo m = (Mundo) appContext.getBean("marte");
		
		System.out.println(m.getSaludo());
		
		((ConfigurableApplicationContext)appContext).close();
		
		
	}

}