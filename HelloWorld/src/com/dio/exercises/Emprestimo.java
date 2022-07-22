package com.dio.exercises;

import java.util.Scanner;

public class Emprestimo {

	public static void main(String[] args) {
		double valorSolicitado, taxaJuros, quantidadeParcelas;
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Qual o valor do empréstimo em R$");
		valorSolicitado = entrada.nextDouble();
		System.out.println("Qual é a taxa de juros ao mês? (a.m)");
		taxaJuros = entrada.nextDouble();
		taxaJuros /= 100;
		System.out.println("Qual é a quantidade de parcelas desejada?");
		quantidadeParcelas = entrada.nextDouble();
				
	
		//Aqui estou simulando o Sistema de Amortecimento Constante.
		double valorParcelaPuro = valorSolicitado/quantidadeParcelas;
		double valorFinal = 0;
		double valorPestacao = 0;
		
		for(int mes=0;mes<quantidadeParcelas;mes++) {
			double amortecido = mes*valorParcelaPuro;
			double saldoDevedor = valorSolicitado-amortecido;
			valorPestacao = valorParcelaPuro + (saldoDevedor)*taxaJuros;
			valorFinal += valorPestacao;
		}
		
		System.out.println("O valor final que será pago ao no total deverá ser de R$ " + String.format("%.2f", valorFinal));
	}

}
