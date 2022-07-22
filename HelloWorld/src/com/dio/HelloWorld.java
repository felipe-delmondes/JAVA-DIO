package com.dio;


import com.dio.model.Gato;

public class HelloWorld {

	public static void main(String[] args) {
		String nome = "Felipe", nascimento = "1998";
		System.out.println("Hello World!" + "\nEu sou o " + nome + " nascido em " + nascimento);
		System.out.println("E será uma honra acompanhá-los nesse aprendizado!");
		
		Gato garfield = new Gato ("Garfield", "1985", 8);
		
		System.out.println(garfield.toString());
		
		
	}

}
