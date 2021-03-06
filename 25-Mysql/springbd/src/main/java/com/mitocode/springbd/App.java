package com.mitocode.springbd;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.mitocode.beans.Jugador;
import com.mitocode.beans.Marca;
import com.mitocode.service.ServiceJugador;
import com.mitocode.service.ServiceMarca;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ){

    	/*
    	 * video 25
    	
    	Marca mar = new Marca();    	
    	mar.setId(2);
    	mar.setNombre("marca2");
    	
    	ApplicationContext appContext = new ClassPathXmlApplicationContext("com/mitocode/xml/beans.xml"); 

    	ServiceMarca sm = (ServiceMarca)appContext.getBean("serviceMarcaImpl"); 
    	//try {
    	//	sm.registrar(mar);
    	//} catch (Exception e) {
    	//	System.out.println(e.getMessage());
    	//}
    	
    	Marca mar3 = (Marca)appContext.getBean("marca3"); 
    	try {
    		sm.registrar(mar3);
    	} catch (Exception e) {
    		System.out.println(e.getMessage());
    	}
    	 */
    	
    	ApplicationContext appContext = new ClassPathXmlApplicationContext("com/mitocode/xml/beans.xml"); 
    	
    	ServiceJugador sm = (ServiceJugador)appContext.getBean("serviceJugadorImpl"); 
    	Jugador jugador = (Jugador)appContext.getBean("jugador1");
    	
    	try {
    		sm.registrar(jugador);
    	} catch (Exception e) {
    		System.out.println(e.getMessage());
    	}
    	
    	
    }
}
