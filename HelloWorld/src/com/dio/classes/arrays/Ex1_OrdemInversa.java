package com.dio.classes.arrays;

public class Ex1_OrdemInversa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int vetor[] = { -5, 6, 15, 50, 8, 4 };

		System.out.println("Todo vetor sabe seu tamanho " + vetor.length);

		for(int i=vetor.length-1; i>=0; i--) {
			System.out.println(vetor[i]);
		}
	}

}
