package com.dio.classes.arrays;

public class Ex2_Consoantes {

	public static void main(String[] args) {
		char letras[] = { 'a', 'r', 'i', 't', 'b', 'o' };
		int consoantes = 0;
		
		for (char letra : letras) {
			switch (letra) {
			case 'a':break;
			case 'e':break;
			case 'i':break;
			case 'o':break;
			case 'u':break;
			default:
				consoantes++;
			}
		}
		
		System.out.println("O número de consoantes é " + consoantes);
	}

}
