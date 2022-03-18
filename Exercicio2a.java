package br.com.fiap;

import java.util.Scanner;

public class Exercicio2a {
	public static void main(String[] args) {
		int ano, nasc;
		Scanner scan;
		
		System.out.println("Programa para ver a Idade com Scanner! \n");
		
		try {
			scan = new Scanner(System.in);
			System.out.println("Digite o ano atual: ");
			ano = scan.nextInt();
			System.out.println("Digite o ano de seu nascimento: ");
			nasc = scan.nextInt();
			
			System.out.println("\nVocê nasceu no ano de: " +
					nasc + "\nEstamos no ano de: " + ano +
					"\nLogo você tem: " + (ano - nasc) + " anos!"
					);
		} catch (Exception e) {
			System.out.println("Formato de número incorreto");
		}
	}
}
