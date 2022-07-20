package com.dio.calculadora;

import java.util.Scanner;

public class Calculadora {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int a, b, soma, subtracao, divisao, multiplicacao;

		System.out.println("Digite o primeiro valor: ");
		a = input.nextInt();
		System.out.println("Digite o segundo valor: ");
		b = input.nextInt();
		
		soma = soma(a, b);
		subtracao = subtracao(a, b);
		divisao = divisao(a, b);
		multiplicacao = multiplicacao(a, b);
		
		System.out.println("As respostas são: ");
		System.out.println(soma);
		System.out.println(subtracao);
		System.out.println(divisao);
		System.out.println(multiplicacao);
	}

	public static int soma(int a, int b) {
		return a + b;
	}

	public static int subtracao(int a, int b) {
		return a - b;
	}

	public static int divisao(int a, int b) {
		return a / b;
	}

	public static int multiplicacao(int a, int b) {
		return a * b;
	}
}
