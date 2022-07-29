package com.dio.classes.exceptions;

import java.util.Scanner;


//Unchecked exception - A exceção só tem a possibilidade de acontecer em tempo de execução...
public class Testes {

	public static void main(String[] args) {
		String a,b;
		
		Scanner entrada = new Scanner(System.in);
		
		while(true) {
			a = entrada.next();
			b = entrada.next();
			
			
			try {
				int conta = divide(Integer.parseInt(a),Integer.parseInt(b));
				break;
			}catch(NumberFormatException e){
				System.out.println("Um dos valores inseridos não é um número valido... " + e.getMessage());
				//e.printStackTrace();
			}catch(ArithmeticException e){
				System.out.println("Ninguem na história conseguiu dividir por 0... Não vai ser vc que vai conseguir.");
			}finally {
				System.out.println("Chegou no Finally");
			}
			
			System.out.println("O código continua...");
		}
		System.out.println("O código acabou...");

	}
	
	public static int divide(int numerador, int denominador)  {
		return numerador/denominador;
	}
	
	//Unchecked - Exceptions that are found prior to execution and are demanded for the programmer to fix them.
	//An example of that is a file that is supposed to be read but its path leads to nowhere, the compiler can check
	//If the file exists even before trying to execute the file.

}

//é possível criar a própria exceção que herda da Exception
class ImpossivelAberturaDeArquivoException extends Exception
{
	private String nomeDoArquivo;
	private String diretorio;
	public ImpossivelAberturaDeArquivoException( String nomeDoArquivo, String diretorio) {
		super("O arquivo " + nomeDoArquivo + "não foi encontrado no diretório " + diretorio);
		this.nomeDoArquivo = nomeDoArquivo;
		this.diretorio = diretorio;
	}
	@Override
	public String toString() {
		return "ImpossivelAberturaDeArquivoException [nomeDoArquivo=" + nomeDoArquivo + ", diretorio=" + diretorio
				+ "]";
	}
	
	
}
