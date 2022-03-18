package br.com.fiap;

import java.util.Scanner;

public class Exercicio1a {
	public static void main(String[] args) {
		float prova1, prova2, prova3, prova4;
		Scanner scan;
		
		System.out.println("Programa para ver a Média com Scanner! \n");
		
		try {
			scan = new Scanner(System.in);
			System.out.println("Digita a nota da Prova 1:");
			prova1 = scan.nextFloat();
			System.out.println("Digita a nota da Prova 2:");
			prova2 = scan.nextFloat();
			System.out.println("Digita a nota da Prova 3:");
			prova3 = scan.nextFloat();
			System.out.println("Digita a nota da Prova 4:");
			prova4 = scan.nextFloat();
			
			System.out.println("A média aritmética simples é: " +
					((prova1 + prova2 + prova3 + prova4) / 4)
					);
		} catch (Exception e) {
			System.out.println("Formato de número incorreto");
		}
	}
}