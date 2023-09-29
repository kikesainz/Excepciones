package com.kike.ejercicios;

import java.util.Scanner;

import com.kike.exceptions.NegativeNumberException;

public class Utilidades {

	private Scanner sc = new Scanner(System.in);

	public int pedirNum() {
		System.out.print("Introduzca un número entero: ");
		return  Integer.parseInt(sc.nextLine());
	}
		
	public void comprobarNum(int num) throws NegativeNumberException {
		if(num < 0) {
			throw new NegativeNumberException("No se puede introducir un número negativo");
		}
	}
}
