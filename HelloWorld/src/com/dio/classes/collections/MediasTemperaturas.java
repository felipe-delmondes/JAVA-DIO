package com.dio.classes.collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class MediasTemperaturas {

	public static void main(String[] args) {

		List<Double> temperaturas = new ArrayList<>();

		temperaturas.add(21.2);
		temperaturas.add(23.7);
		temperaturas.add(20.9);
		temperaturas.add(17.8);
		temperaturas.add(28.5);
		temperaturas.add(30.2);

		Iterator<Double> iterador = temperaturas.iterator();

		double media = 0;
		while (iterador.hasNext()) {
			media += iterador.next() / 6.0;
		}

		System.out.println(media);

		for (double temp : temperaturas) {
			if (temp > media) {
				String answer="";
				switch (temperaturas.indexOf(temp)) {
				case 0:
					answer = "1 - Janeiro: " + temp + "C";
					break;
				case 1:
					answer = "2 - Fevereiro: " + temp + "C";
					break;
				case 2:
					answer = "3 - Março: " + temp + "C";
					break;
				case 3:
					answer = "4 - Abril: " + temp + "C";
					break;
				case 4:
					answer = "5 - Maio: " + temp + "C";
					break;
				case 5:
					answer = "6 - Junho: " + temp + "C";
					break;
				}
				System.out.println(answer);
			}
		}

	}

}
