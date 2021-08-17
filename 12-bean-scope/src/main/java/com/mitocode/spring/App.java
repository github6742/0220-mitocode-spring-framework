package com.mitocode.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.mitocode.beans.Ciudad;
import com.mitocode.beans.Persona;

public class App {

	public static void main(String[] args) {

		ApplicationContext appContext = new ClassPathXmlApplicationContext("com/mitocode/xml/beans.xml");
		Persona per = (Persona) appContext.getBean("persona");
		Persona per2 = (Persona) appContext.getBean("persona");
		
		//System.out.println(per.getId() + " " + per.getNombre() + " " + per.getApodo() + " " + per.getPais().getNombre() + " " + 
				           //per.getCiudad().getNombre());

		System.out.println(per);
		System.out.println(per2);
		/*
		 * com.mitocode.beans.Persona@306cf3ea
		   com.mitocode.beans.Persona@2beee7ff
		 */
		((ConfigurableApplicationContext) appContext).close();

	}

}

