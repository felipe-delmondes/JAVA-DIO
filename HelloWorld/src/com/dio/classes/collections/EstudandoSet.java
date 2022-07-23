package com.dio.classes.collections;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class EstudandoSet {

	public static void main(String[] args) {
		
		Set<Double> notas = new HashSet<>(Arrays.asList(7d,8.5,9.3,5d,7d,0d,3.6));
		
		//Note que 7d que havia sido inserido duas vezes se torna único.
		System.out.println(notas);
		
		System.out.println("Confere se a nota 5 está no conjunto " + notas.contains(5d));
		
		System.out.println("Confere a menor nota do conjunto " +Collections.min(notas));
		
		System.out.println("Confere a maior nota do conjunto " +Collections.max(notas));
		
		System.out.println("Soma dos itens:");
		Double soma = 0.0;
		
		Iterator<Double> iterador =  notas.iterator();
		
		while(iterador.hasNext()) {
			soma += iterador.next();
		}
		
		System.out.println(soma);
		
		//Removendo um elemento.
		notas.remove(0d);
		
		System.out.println(notas);
		
		System.out.println("Remove as notas menores que 7");
		
		Iterator<Double> iterador2 = notas.iterator();
		
		while(iterador2.hasNext()) {
			if (iterador2.next() < 7) iterador2.remove();
		}
		
		
		System.out.println(notas);
		
		System.out.println("Mantendo as notas na ordem informada:");
		
		Set<Double> notas2 = new LinkedHashSet<>();
		
		notas2.add(7d);
		notas2.add(8.5);
		notas2.add(9.3);
		notas2.add(5d);
		notas2.add(7d);
		notas2.add(0d);
		notas2.add(3.6);
		
		System.out.println(notas2);
		
	}

}
