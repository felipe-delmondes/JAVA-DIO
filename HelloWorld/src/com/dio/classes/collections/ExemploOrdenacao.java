package com.dio.classes.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ExemploOrdenacao {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Gato gato1 = new Gato("Jon", 18, "preto");
		Gato gato2 = new Gato("Simba", 6, "tigrado");
		Gato gato3 = new Gato("Jon", 12, "amarelo");

		List<Gato> gatos = new ArrayList<>();

		gatos.add(gato1);
		gatos.add(gato2);
		gatos.add(gato3);

		// System.out.println(gatos);

		// Acessando os gatos e imprimindo na ordem de inserção.
		System.out.print(gatos);

		// Acessando os gatos e imprimindo na ordem aleatória.
		Collections.shuffle(gatos);

		System.out.print(gatos);

		// Ordenando de acordo com algum critério
		Collections.sort(gatos);

		System.out.println(gatos);

		// Ordenando de acordo com a idade
		gatos.sort(new ComparatorIdade());

		System.out.println(gatos);

		// Ordenando de acordo com a cor
		gatos.sort(new ComparatorColor());

		System.out.println(gatos);
		
		// Ordenando de acordo com o nome cor e idade
				gatos.sort(new ComparatorNameColorIdade());

				System.out.println(gatos);


	}

}

class Gato implements Comparable<Gato> {
	private String nome;
	private int idade;
	private String cor;

	@Override
	public String toString() {
		return "[nome=" + nome + ", idade=" + idade + ", cor=" + cor + "]\n";
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public Gato(String nome, int idade, String cor) {
		this.nome = nome;
		this.idade = idade;
		this.cor = cor;
	}

	@Override
	public int compareTo(Gato gato) {
		// TODO Auto-generated method stub
		return this.getNome().compareToIgnoreCase(gato.getNome());
	}

}

class ComparatorIdade implements Comparator<Gato> {

	@Override
	public int compare(Gato gato1, Gato gato2) {
		return Integer.compare(gato1.getIdade(), gato2.getIdade());
	}
}

class ComparatorColor implements Comparator<Gato> {

	@Override
	public int compare(Gato gato1, Gato gato2) {
		return gato1.getCor().compareToIgnoreCase(gato2.getCor());
	}
}

class ComparatorNameColorIdade implements Comparator<Gato> {

	@Override
	public int compare(Gato gato1, Gato gato2) {
		if (gato1.getNome().compareToIgnoreCase(gato2.getNome()) != 0){
			return gato1.getNome().compareToIgnoreCase(gato2.getNome());
		}else if(gato1.getCor().compareToIgnoreCase(gato2.getCor()) != 0){
			return gato1.getCor().compareToIgnoreCase(gato2.getCor());
		}else {
			return Integer.compare(gato1.getIdade(), gato2.getIdade());
		}
		
	}
}