package com.mitocode.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mitocode.beans.Jugador;
import com.mitocode.beans.Marca;
import com.mitocode.dao.DAOJugador;
import com.mitocode.dao.DAOMarca;

@Service
public class ServiceJugadorImpl implements ServiceJugador{

	@Autowired
	private DAOJugador daoJugador;

	@Override
	public void registrar(Jugador jugador) throws Exception {
		try {
			daoJugador.registrar(jugador);
		} catch (Exception e) {
			throw e;
		}
			
	}

}
