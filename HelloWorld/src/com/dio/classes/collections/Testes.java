package com.dio.classes.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class Testes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Inicializando essa ArrayList de forma que ela seja mutável.
		List<Double> notas = new ArrayList<>();
		//ArrayList<Double> notas = new ArrayList<>();
		
		System.out.println("Inserindo 7 elementos com o método add!");
		//Ai ela aceita a adição de novos itens!
		notas.add(7.0);
		notas.add(8.5);
		notas.add(9.3);
		notas.add(5.0);
		notas.add(7.0);
		notas.add(0.0);
		notas.add(3.6);
		
		
		System.out.println(notas.toString());
		
		System.out.println("Exibindo a nota na posição 5: " + notas.get(4));
		System.out.println("Exibindo a posição da nota 3.6: " + notas.indexOf(3.6));
		
		System.out.println("Adicionando uma nota em uma posição bem específica!");
		notas.add(4, 8.0);
		System.out.println(notas.toString());
		
		System.out.println("Substituindo a nota de uma posição bem específica!");
		notas.set(notas.indexOf(5.0), 6.0);
		System.out.println(notas.toString());
		
		//Primeiro uso da vida do operador Ternário!
		String answer = (notas.contains(5.0))?"A nota 5.0 está presente":"A nota 5.0 não está presente";
		
		System.out.println(answer);
		
		System.out.println("Exibindo a menor nota!");
		System.out.println(Collections.min(notas));
		
		System.out.println("Exibindo a soma das notas!");
		Iterator<Double> iterador =  notas.iterator();
		
		Double soma = 0d;
		
		while(iterador.hasNext()) {
			soma += iterador.next();
		}
		
		System.out.println("A soma é " + soma );
		
		System.out.println("Remove as notas menores que 7");
		
		Iterator<Double> iterador2 = notas.iterator();
		
		while(iterador2.hasNext()) {
			if (iterador2.next() < 7) iterador2.remove();
		}
		
		System.out.println(notas);
		
		System.out.println("Apaga toda a lista");
		notas.clear();
		
		System.out.println(notas.isEmpty());
		
		
	}

}
