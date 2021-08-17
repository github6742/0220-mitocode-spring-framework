package com.mitocode.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.mitocode.beans.Ciudad;
import com.mitocode.beans.Persona;

public class App {

	public static void main(String[] args) {

		ApplicationContext appContext = new ClassPathXmlApplicationContext("com/mitocode/xml/beans.xml");
		Persona per = (Persona) appContext.getBean("personaBean2");

		String nombresCiudades = "";
		
		for (Ciudad ciu: per.getPais().getCiudades()) {
			nombresCiudades += ciu.getNombre() + "-";
		}
		
		System.out.println(per.getId() + " " + per.getNombre() + " " + per.getApodo() + " " + per.getPais().getNombre() + " " + 
				           nombresCiudades);

		((ConfigurableApplicationContext) appContext).close();

	}

}

