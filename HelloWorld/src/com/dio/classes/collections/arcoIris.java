package com.dio.classes.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class arcoIris {

	public static void main(String[] args) {
		//LinkedHashSet keeps the ordering of itens insertion
		Set<String> cores = new LinkedHashSet<>();
		
		cores.add("Verde");
		cores.add("Amarelo");
		cores.add("Vermelho");
		cores.add("Azul");
		cores.add("Violeta");
		cores.add("Laranja");
		
		System.out.println("O arco-íris tem " + cores.size() + " cores");
		
		//TreeSet naturally orders elements in accordance with the Natural order implemented in the Comparable.
		Set<String> coresOrdenadas = new TreeSet<>(cores);
		
		System.out.println("As cores ordenadas são: " + coresOrdenadas);
		
		System.out.println("As cores na ordem informadas são: " + cores);
		
		//Para exibir na ordem inversa eu criarei uma lista!! E a reverterei.
		
		List<String> coresInversa = new ArrayList<>(cores);
		
		Collections.reverse(coresInversa);
		
		System.out.println("As cores na ordem inversa são: " + coresInversa);
		
		//Exibir as cores que começam com V.
		
		Iterator<String> iterador = cores.iterator();
		
		while(iterador.hasNext()) {
			String cor = iterador.next();
			
			if (cor.startsWith("V"))
					System.out.println(cor);
			else
				iterador.remove();
		}
		
		//Limpando o conjunto
		cores.clear();
		
		System.out.println("O conjunto está vazio? " + cores.isEmpty());
		
		
		
	}

}
