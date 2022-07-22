package com.dio.exercises;

import java.util.Scanner;

public class Calculadora {

	public static void main(String[] args) {
		double primeiroValor, segundoValor;
		int escolha;
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Bem vindo a calculadora de 4 operações!\nO que deseja fazer? ");
		System.out.println("1-Somar");
		System.out.println("2-Subtrair");
		System.out.println("3-Multiplicar");
		System.out.println("4-Dividir");
		
		escolha = entrada.nextInt();
		
		System.out.println("A escolha foi " + escolha + "\n\n");
		
		System.out.println("Insira o primeiro valor: ");
		primeiroValor = entrada.nextDouble();
		System.out.println("Insira o segundo valor: ");
		segundoValor = entrada.nextDouble();
		
		if (escolha == 1){
			System.out.println("O resultado da soma é " + soma(primeiroValor,segundoValor));
		}else if (escolha == 2){
			System.out.println("O resultado da subtração é " + subtracao(primeiroValor,segundoValor));
		}else if (escolha == 3){
			System.out.println("O resultado da multiplicação é " + multiplicacao(primeiroValor,segundoValor));
		}else {
			System.out.println("O resultado da divisão é " + divisao(primeiroValor,segundoValor));
		}
		

	}
	
	public static double soma(double primeiroValor, double segundoValor) {
		return primeiroValor + segundoValor;
	}
	
	public static double subtracao(double primeiroValor, double segundoValor) {
		return primeiroValor - segundoValor;
	}
	
	public static double multiplicacao(double primeiroValor, double segundoValor) {
		return primeiroValor * segundoValor;
	}
	
	public static double divisao(double primeiroValor, double segundoValor) {
		return primeiroValor / segundoValor;
	}

}
