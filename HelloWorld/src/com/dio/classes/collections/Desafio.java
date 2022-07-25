package com.dio.classes.collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

public class Desafio {

	public static void main(String[] args) {
		Random rand = new Random();
		
		List<Integer> plays = new ArrayList<>();
		
		plays.add(0);
		plays.add(0);
		plays.add(0);
		plays.add(0);
		plays.add(0);
		plays.add(0);
		
		for(int i=0; i<100; i++) {
			int numeroDado = rand.nextInt(6)+1;
			plays.set(numeroDado-1, plays.get(numeroDado-1)+1);	
		}
		
		Map<String, Integer> jogadas = new HashMap<>();
		
		jogadas.put("Lado 1", plays.get(0));
		jogadas.put("Lado 2", plays.get(1));
		jogadas.put("Lado 3", plays.get(2));
		jogadas.put("Lado 4", plays.get(3));
		jogadas.put("Lado 5", plays.get(4));
		jogadas.put("Lado 6", plays.get(5));
		
		System.out.println(jogadas);

	}

}
