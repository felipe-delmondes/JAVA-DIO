package com.dio.classes.collections;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class EstudandoMap {

	public static void main(String[] args) {
		Map<String, Double> carrosPopulares = new HashMap<>();
		//O Map cria uma estrutura de Keys, Values

		carrosPopulares.put("gol", 14.1);
		carrosPopulares.put("uno", 15.6);
		carrosPopulares.put("mobi", 16.1);
		carrosPopulares.put("hb20", 14.5);
		carrosPopulares.put("kwid", 15.6);
	
		
		//Substituindo o consumo do gol
		carrosPopulares.put("gol", 15.2);
		System.out.println(carrosPopulares);
	
		System.out.println("Tem tucson? " + carrosPopulares.containsKey("tucson"));
		
		System.out.println("O consumo do uno é " + carrosPopulares.get("uno")); 
		
		//Retirando um set das Keys
		Set<String> modelos = carrosPopulares.keySet();
		
		System.out.println("Os modelos são " + modelos);
		
		//Exibindo os consumos dos carros
		Collection<Double> consumos = carrosPopulares.values();

		
		System.out.println(consumos);
		
		//O modelo mais econômico
		
		Double menorConsumo = Collections.max(consumos);
		
		
		Set<Map.Entry<String, Double>> banana =  carrosPopulares.entrySet();	
		
		Iterator<Map.Entry<String, Double>> iterador = banana.iterator();
		
		while(iterador.hasNext()) {
			Map.Entry<String, Double> par = iterador.next();
			
			if (par.getValue() == menorConsumo) {
				System.out.println("O modelo mais econômico é o " + par.getKey());
			}
		}
	
	}
	
	

}
