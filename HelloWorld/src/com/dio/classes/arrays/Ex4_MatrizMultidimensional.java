package com.dio.classes.arrays;

import java.util.Random;

public class Ex4_MatrizMultidimensional {

	public static void main(String[] args) {
		int matrix[][] = new int[4][4];
		
		Random aleatorio = new Random();
		
		for(int i=0; i<matrix.length; i++) {
			for(int j=0; j<matrix[i].length; j++) {
				matrix[i][j] = aleatorio.nextInt(10);
			}
		}
		
		for(int i=0; i<matrix.length; i++) {
			for(int j=0; j<matrix[i].length; j++) {
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println();
		}

	}

}
