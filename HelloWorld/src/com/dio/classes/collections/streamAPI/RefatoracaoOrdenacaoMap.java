package com.dio.classes.collections.streamAPI;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeSet;
import java.util.function.Function;

public class RefatoracaoOrdenacaoMap {

	public static void main(String[] args) {
		
		//Map simples, key value without keeping of order
		Map<Integer, Contato> agenda = new HashMap<>() {{
			put(1,new Contato("Simba", 5555));
			put(4,new Contato("Cami", 1111));
			put(3,new Contato("Jon", 2222));
		}};
		
		//Organizando por ordem do número de telefone
		/*Set<Map.Entry<Integer, Contato>> set = new TreeSet<>(new Comparator<Map.Entry<Integer,Contato>>() {
		
			public int compare(Map.Entry<Integer, Contato> cont1, Map.Entry<Integer, Contato> cont2) {
				return Integer.compare(cont1.getValue().getNumero(),cont2.getValue().getNumero());
			}
		});*/
		
		//Interface Funcional
		/*Set<Map.Entry<Integer, Contato>> set = new TreeSet<>(Comparator.comparing(
				new Function<Map.Entry<Integer, Contato>,Integer>() {

					@Override
					public Integer apply(Entry<Integer, Contato> cont) {
						// TODO Auto-generated method stub
						return cont.getValue().getNumero();
					}
		}));*/
		
		//Lambda
		Set<Map.Entry<Integer, Contato>> set = new TreeSet<>(Comparator.comparing(
			 cont -> cont.getValue().getNumero()));
		
		
	}

}
