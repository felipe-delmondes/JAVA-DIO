package com.dio.classes.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Investigacao {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);

		List<String> perguntas = new ArrayList<>();

		perguntas.add("Telefonou para a vítima?");
		perguntas.add("Esteve no local do crime?");
		perguntas.add("Mora perto da vítima?");
		perguntas.add("Devia para a vítima?");
		perguntas.add("Já trabalhou com a vítima?");

		Collections.shuffle(perguntas);

		Iterator<String> iterador = perguntas.iterator();

		int contadorAfirmativos = 0;
		String pergunta = "";
		String resposta = "";
		while (iterador.hasNext()) {

			pergunta = iterador.next();

			System.out.println(pergunta);

			resposta = entrada.next();

			if (resposta.equalsIgnoreCase("S"))
				contadorAfirmativos++;

		}

		String veredito = "";
		switch (contadorAfirmativos) {
		case 2:
			veredito = "Suspeita";
			break;
		case 3:
			veredito = "Cúmplice";
			break;
		case 4:
			veredito = "Cúmplice";
			break;
		case 5:
			veredito = "Assassina";
			break;
		default:
			veredito = "Inocente";
		}
		
		System.out.println("O indivíduo é " + veredito);
	}

}
