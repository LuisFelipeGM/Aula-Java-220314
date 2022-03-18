package br.com.fiap;

import javax.swing.JOptionPane;

public class Exercicio1b {

	public static void main(String[] args) {
		float prova1, prova2, prova3, prova4;
		String aux;
		
		JOptionPane.showMessageDialog(null, "Programa para ver a Média com JOptionPane! \n");
		
		try {
			aux = JOptionPane.showInputDialog("Digita a nota da Prova 1:");
			prova1 = Float.parseFloat(aux);
			aux = JOptionPane.showInputDialog("Digita a nota da Prova 2:");
			prova2 = Float.parseFloat(aux);
			aux = JOptionPane.showInputDialog("Digita a nota da Prova 3:");
			prova3 = Float.parseFloat(aux);
			aux = JOptionPane.showInputDialog("Digita a nota da Prova 4:");
			prova4 = Float.parseFloat(aux);
			
			JOptionPane.showMessageDialog(null,
					"A média aritimética simples é: " +
					((prova1 + prova2 + prova3 + prova4) / 4)
					);
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "Formato de número incorreto");
		}

	}

}
