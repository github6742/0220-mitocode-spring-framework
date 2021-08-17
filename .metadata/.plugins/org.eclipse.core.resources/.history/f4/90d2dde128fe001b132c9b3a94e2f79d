package com.mitocode.beans;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.mitocode.interfaces.IEquipo;

/*
 * La diferencia entre estos estereotipos es 
 * @Component, se define un bean de manera generica. Es un componente que spring no va a reconocer en el 
 *             archivo de configuracion.
 * Con los demas estas haciendo los mismo, pero se utilizan para programacion en capa.
 * Para las partes de datos su utiliza el patron dao, es mas comun utilizar repository.
 * Para la capa de servicios se utiliza la notacion service.            
 * Para la controlador se utiliza el @controller
 * Todas hacen lo mismo.
 * 
 */

//@Component
//@Repository
//@Service
@Controller
public class Barcelona implements IEquipo{

	@Override
	public String mostrar() {
		return "Barcelona FC";
	}

}
