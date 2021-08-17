package com.mitocode.spring;

import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.mitocode.beans.Barcelona;
import com.mitocode.beans.Ciudad;
import com.mitocode.beans.Jugador;
import com.mitocode.beans.Juventus;
import com.mitocode.beans.Persona;
import com.mitocode.interfaces.IEquipo;

public class App {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Elija un equipo: 1-Barcelon 2-Juventus");
		int respuesta = sc.nextInt();

		ApplicationContext appContext = new AnnotationConfigApplicationContext(AppConfig.class);
		Jugador jug = (Jugador) appContext.getBean("jugador1");
		
		switch (respuesta) {
		case 1:
			jug.setEquipo(new Barcelona());
			break;
		case 2:
			jug.setEquipo(new Juventus());
			break;
		default:	
			break;
		}
		
		System.out.println(jug.getNombre()+"-"+
						   jug.getEquipo().mostrar()+"-"+
						   jug.getCamiseta().getNumero()+"-"+
						   jug.getCamiseta().getMarca().getNombre()
		                   );
		
		((ConfigurableApplicationContext) appContext).close();

	}

}

