package com.dio.classes.collections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ExercisesLinkedList {

	public static void main(String[] args) {
	
		List<Double> notas = new ArrayList<>();
		List<Double> listaLinkada = new LinkedList<>();
		
		System.out.println("Inserindo 7 elementos com o método add em notas!");

		notas.add(7.0);
		notas.add(8.5);
		notas.add(9.3);
		notas.add(5.0);
		notas.add(7.0);
		notas.add(0.0);
		notas.add(3.6);
		
		listaLinkada.addAll(notas);
		
		System.out.println(listaLinkada);
		
		System.out.println("A primeira nota da lista Linkada é " + listaLinkada.get(0));
		
		System.out.println("A lista permanece como" + listaLinkada);
		
		System.out.println("A primeira nota da lista Linkada removendo é " + listaLinkada.remove(0));
		
		System.out.println("A lista permanece como" + listaLinkada);
		
		
	}

}
