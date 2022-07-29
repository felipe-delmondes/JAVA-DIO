package com.dio.classes.collections.streamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.Map.Entry;
import java.util.Set;
import java.util.stream.Collectors;

public class OperacoesStream {

	public static void main(String[] args) {
		
		List<String> numerosAleatorios = Arrays.asList("1","0","4","1","2","3","9","9","6","5");
		//Imprimindo todos os elementos
		
		//System.out.println("Imprima todos os elementos dessa lista de String: ");
		/*numerosAleatorios.stream().forEach(new Consumer<String>() {

			@Override
			public void accept(String t) {
				System.out.println(t);
				
			}
		});*/
		/*
		//numerosAleatorios.stream().forEach(t -> System.out.println(t));
		//numerosAleatorios.forEach(t -> System.out.println(t));
		numerosAleatorios.forEach(System.out::println);
		
		numerosAleatorios.stream()
			.limit(5)
			.collect(Collectors.toSet())
			.forEach(System.out::println);*/
		/*
		//Transformar a lista de Strings em lista de números inteiros
		
		List<Integer> collectList = numerosAleatorios.stream()
		.map(Integer::parseInt)
		.collect(Collectors.toList());*/
		/*
		//Pegue os números pares e maiores que 2 e coloque em uma lista
		List<Integer> numeros = numerosAleatorios.stream()
		.map(Integer::parseInt)
		.filter(t ->  (t%2 == 0 && t>2 ))
		.collect(Collectors.toList());*/
		/*
		//Mostrando a média
		numerosAleatorios.stream()
				.mapToInt(Integer::parseInt)
				.average()
				.ifPresent(System.out::println);*/
		
		/*
		List<Integer> numerosInteiros = numerosAleatorios.stream()
		.map(Integer::parseInt)
		.collect(Collectors.toList());
		
		numerosInteiros.removeIf(t -> t%2 == 1);*/
		
		//Ignore os 3 primeiros elementos da lista
		
		/*
		numerosAleatorios.stream()
			.map(Integer::parseInt)
			.collect(Collectors.toList())
			.subList(3, numerosAleatorios.size())
			.forEach(System.out::println);*/
		
		//Retirando os numeros repetidos da lista, quantos restam?
		
		/*
		Integer tamanhoListaReduzida = numerosAleatorios.stream()
		.collect(Collectors.toSet()).size();
		
		System.out.println(tamanhoListaReduzida);*/
/*
		//Qual o menor valor da lista?
		
		Integer menorNumero = numerosAleatorios.stream()
		.map(Integer::parseInt)
		.min(Integer::compare).get();
		
		System.out.println(menorNumero);
		
		//Qual o maior valor da lista?
		
				Integer maiorNumero = numerosAleatorios.stream()
				.map(Integer::parseInt)
				.max(Integer::compare).get();
				
				System.out.println(maiorNumero);*/
		
		/*
		//Pegue os impares e some
		Integer soma = 0;
		List<Integer> ListaImpares = numerosAleatorios.stream()
				.map(Integer::parseInt)
				.filter(t ->  (t%2 == 1 ))
				.collect(Collectors.toList());
		
		for(Integer nummer:ListaImpares) {
			soma += nummer;
		}*/
		
		//Ordenando
		
		List<Integer> IntegerList = numerosAleatorios.stream()
				.map(Integer::parseInt)
				.collect(Collectors.toList());
		
		IntegerList.sort(Integer::compare);
		System.out.println(IntegerList);
		
		//Agrupando multiplos de 3 e 5
		
		Set<Entry<Boolean,List<Integer>>> agrupamento = numerosAleatorios.stream()
				.map(Integer::parseInt)
				.collect(Collectors.groupingBy(t -> t%3 == 0 && t%5==0 && t%2 != 0)).entrySet();
		
		System.out.println(agrupamento);

		
		
		
		
		

	}

}
