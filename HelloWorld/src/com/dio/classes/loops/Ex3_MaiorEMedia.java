package com.dio.classes.loops;

import java.util.Arrays;
import java.util.Scanner;

public class Ex3_MaiorEMedia {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		
		double numeros[] = new double[5];
		
		for(int i=0; i<5; i++) {
			System.out.println("Insira o número " + (i+1));
			numeros[i] = entrada.nextDouble();
		}
		
		Arrays.sort(numeros);
		
		System.out.println("O máximo valor é " + numeros[4]);
		
		double acumulador = 0;
		for(double numero:numeros) {
			acumulador += numero;
		}
		
		System.out.println("O valor da média é " + acumulador/5.0);
		
	}

}
