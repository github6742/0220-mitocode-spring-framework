package com.mitocode.beans;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class MitoCodeBeanPostProcessor implements BeanPostProcessor{
	
	@Override
	public Object postProcessAfterInitialization(Object bean, String nombreBean) throws BeansException {
		System.out.println("Despues de la inicializacion: " + nombreBean);
		return bean;		
	}
	
	@Override
	public Object postProcessBeforeInitialization(Object bean, String nombreBean) throws BeansException {
		System.out.println("Antes de la inicializacion: " + nombreBean);
		return bean;		
	}
 
}
