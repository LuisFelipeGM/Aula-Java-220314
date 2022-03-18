package br.com.fiap;

import javax.swing.JOptionPane;

public class Exercicio3b {
	
	public static void main(String[] args) {
		
		final float PI = 3.1416f;
		float raio;
		String aux;
		
		JOptionPane.showMessageDialog(null, "Programa para ver a �rea de um c�rculo com JOptionPane! \n");
		
		try {
			aux = JOptionPane.showInputDialog("Digite o valor do raio de um c�rculo: ");
			raio = Float.parseFloat(aux);
			
			JOptionPane.showMessageDialog(null,
					"\nO valor do raio do c�rculo �: "
					+ raio + "\nO valor da �rea do c�rculo �: "
					+ ((raio * raio)* PI)
					);
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "Formato de n�mero incorreto");
		}
	}
}
