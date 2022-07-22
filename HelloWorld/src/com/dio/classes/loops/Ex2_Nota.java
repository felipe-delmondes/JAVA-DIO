package com.dio.classes.loops;

import java.util.Scanner;

public class Ex2_Nota {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		double nota;
		
		do {
			System.out.println("Insira uma nota entre 0 e 10:");
			nota = entrada.nextDouble();
		}while(nota < 0 || nota > 10);
		
		

	}

}
