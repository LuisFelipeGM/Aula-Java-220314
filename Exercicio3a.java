package br.com.fiap;

import java.util.Scanner;

public class Exercicio3a {
	
	public static void main(String[] args) {
		
		final float PI = 3.1416f;
		float raio;
		Scanner scan;
		
		System.out.println("Programa para ver a �rea de um c�rculo com Scanner! \n");
		
		try {
			scan = new Scanner(System.in);
			System.out.println("Digite o valor do raio de um c�rculo: ");
			raio = scan.nextFloat();
			
			System.out.println("\nO valor do raio do c�rculo �: "
					+ raio + "\nO valor da �rea do c�rculo �: "
					+ ((raio * raio)* PI)
					);
		} catch (Exception e) {
			System.out.println("Formato de n�mero incorreto");
		}
	}
}
