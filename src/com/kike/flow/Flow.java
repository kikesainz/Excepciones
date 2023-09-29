package com.kike.flow;

import com.kike.ejercicios.Utilidades;
import com.kike.exceptions.NegativeNumberException;

public class Flow {

	public Flow() {
		boolean correcto = false;
		Utilidades ej = new Utilidades();
		
		while(!correcto) {
			try {
				ej.comprobarNum(ej.pedirNum());
				correcto = true;
				System.out.println("Programa finalizado con éxito.");
			} catch (NegativeNumberException e) {
				System.err.println(e.getMessage()+", vuelva a intentarlo.");	
			}
		}
	}
}
