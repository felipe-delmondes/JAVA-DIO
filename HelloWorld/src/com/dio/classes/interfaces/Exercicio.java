package com.dio.classes.interfaces;

public class Exercicio {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculadora calc = new Calculadora();
	
		System.out.println(calc.soma(2, 3));

	}

}

interface OperacaoMatematica{
	public int soma(int primeiroValor, int segundoValor);
	public int subtracao(int primeiroValor, int segundoValor);
	public int multiplicacao(int primeiroValor, int segundoValor);
	public int divisao(int primeiroValor, int segundoValor);
	
}

class Calculadora implements OperacaoMatematica{

	@Override
	public int soma(int primeiroValor, int segundoValor) {
		return primeiroValor + segundoValor;
	}

	@Override
	public int subtracao(int primeiroValor, int segundoValor) {
		// TODO Auto-generated method stub
		return primeiroValor - segundoValor;
	}

	@Override
	public int multiplicacao(int primeiroValor, int segundoValor) {
		// TODO Auto-generated method stub
		return primeiroValor * segundoValor;
	}

	@Override
	public int divisao(int primeiroValor, int segundoValor) {
		// TODO Auto-generated method stub
		return primeiroValor / segundoValor;
	}
	
}