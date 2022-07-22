package com.dio.exercises;

import java.util.Scanner;

public class Greetings {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		System.out.println("Insira a hora do dia no formato 24h:");

		int hora = entrada.nextInt();

		if (hora >= 6 && hora <= 12) {
			System.out.println("Bom dia!");
		} else if (hora > 12 && hora < 18) {
			System.out.println("Boa tarde!");
		} else {
			System.out.println("Boa noite!");

		}

	}
}
