package com.mitocode.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.mitocode.beans.Ciudad;
import com.mitocode.beans.Jugador;
import com.mitocode.beans.Persona;
import com.mitocode.interfaces.IEquipo;

public class App {

	public static void main(String[] args) {

		ApplicationContext appContext = new ClassPathXmlApplicationContext("com/mitocode/xml/beans.xml");

		//Jugador jug = (Jugador) appContext.getBean("messi");
		//System.out.println(jug.getNombre() + "-"+jug.getEquipo().mostrar());

		IEquipo bar = (IEquipo) appContext.getBean("barcelona");
		System.out.println(bar.mostrar());

		IEquipo bar2 = (IEquipo) appContext.getBean("juventus");
		System.out.println(bar2.mostrar());
		
		
		((ConfigurableApplicationContext) appContext).close();

	}

}

