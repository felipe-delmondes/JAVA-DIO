package com.dio.classes.loops;

import java.util.Scanner;

public class Ex1_NomeEIdade {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		String nomes[] = new String[10];
		int idades[] = new int[10];

		int i = -1;

		do {
			i++;
			System.out.println("Insira o nome do aluno ou 0 para sair:");
			nomes[i] = entrada.next();
			System.out.println("Insira a idade do aluno:");
			idades[i] = entrada.nextInt();
		} while (idades[i] != 0);

		//For-each name in names
		for (String nome : nomes) {
			System.out.println(nome);
		}

	}

}
