package com.dio.classes.collections;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class ExerciciosMap {

	public static void main(String[] args) {
		Map<String, Integer> populacoes = new HashMap<>();
		
		populacoes.put("PE",9616621);
		populacoes.put("AL",3351543);
		populacoes.put("CE",9187103);
		populacoes.put("RN",3534265);
		
		//Substituindo a população de RN
		populacoes.put("RN",3534165);
		
		if (!populacoes.containsKey("PB")) {
			populacoes.put("PB",4039277);
		}
		
		System.out.println("A população de Pernambuco é " + populacoes.get("PE")); 
		
		//Para manter a ordem de inserção
		Map<String, Integer> populacoes2 = new LinkedHashMap<>();
		
		populacoes2.put("PE",9616621);
		populacoes2.put("AL",3351543);
		populacoes2.put("CE",9187103);
		populacoes2.put("RN",3534265);
		
		//Substituindo a população de RN
		populacoes2.put("RN",3534165);
		
		if (!populacoes2.containsKey("PB")) {
			populacoes2.put("PB",4039277);
		}
		
		System.out.println(populacoes2);
		
		//Para ordem alfabetica
		Map<String, Integer> populacoes3 = new TreeMap<>();
		
		populacoes3.put("PE",9616621);
		populacoes3.put("AL",3351543);
		populacoes3.put("CE",9187103);
		populacoes3.put("RN",3534265);
		
		//Substituindo a população de RN
		populacoes3.put("RN",3534165);
		
		if (!populacoes3.containsKey("PB")) {
			populacoes3.put("PB",4039277);
		}
		
		System.out.println(populacoes3);
		
		//estado com a menor população
		Collection<Integer> ListPopulacoes = populacoes.values();
		
		Integer menorPopulacao = Collections.min(ListPopulacoes);	
		Integer maiorPopulacao = Collections.max(ListPopulacoes);	
		
		//estado com a menor população
		Set<Map.Entry<String, Integer>> setPopulacoes = populacoes.entrySet();
		
		Integer soma = 0;
		for(Map.Entry<String, Integer> entrada:setPopulacoes) {
			if(entrada.getValue() == menorPopulacao) {
				System.out.println("O estado com a menor população é " + entrada.getKey());
			 }
			if(entrada.getValue() == maiorPopulacao) {
				System.out.println("O estado com a maior população é " + entrada.getKey());
			 }
			soma += entrada.getValue();
		}
		
		System.out.println("A soma da população é " + soma);
		System.out.println("A média da população é " + soma/ListPopulacoes.size());
		
		Set<Map.Entry<String, Integer>> setPopulacoesDecentes = new HashSet<>(setPopulacoes);
		
		//Removendo os estados do mapa!
		for(Map.Entry<String, Integer> entrada:setPopulacoes) {
			if(entrada.getValue() < 4000000) {
				setPopulacoesDecentes.remove(entrada);
			 }
		}
		
		System.out.println(setPopulacoesDecentes);
		
	
		
		
		
		
		
		

	}

}
