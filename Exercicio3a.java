package br.com.fiap;

import java.util.Scanner;

public class Exercicio3a {
	
	public static void main(String[] args) {
		
		final float PI = 3.1416f;
		float raio;
		Scanner scan;
		
		System.out.println("Programa para ver a Área de um círculo com Scanner! \n");
		
		try {
			scan = new Scanner(System.in);
			System.out.println("Digite o valor do raio de um círculo: ");
			raio = scan.nextFloat();
			
			System.out.println("\nO valor do raio do círculo é: "
					+ raio + "\nO valor da área do círculo é: "
					+ ((raio * raio)* PI)
					);
		} catch (Exception e) {
			System.out.println("Formato de número incorreto");
		}
	}
}
