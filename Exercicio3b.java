package br.com.fiap;

import javax.swing.JOptionPane;

public class Exercicio3b {
	
	public static void main(String[] args) {
		
		final float PI = 3.1416f;
		float raio;
		String aux;
		
		JOptionPane.showMessageDialog(null, "Programa para ver a Área de um círculo com JOptionPane! \n");
		
		try {
			aux = JOptionPane.showInputDialog("Digite o valor do raio de um círculo: ");
			raio = Float.parseFloat(aux);
			
			JOptionPane.showMessageDialog(null,
					"\nO valor do raio do círculo é: "
					+ raio + "\nO valor da área do círculo é: "
					+ ((raio * raio)* PI)
					);
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "Formato de número incorreto");
		}
	}
}
