package br.com.fiap;

import javax.swing.JOptionPane;

public class Exercicio2b {
	
	public static void main(String[] args) {
		int ano, nasc;
		String aux;
		
		JOptionPane.showMessageDialog(null, "Programa para ver a Idade com JOptionPane! \n");
		
		try {
			aux = JOptionPane.showInputDialog("Digite o ano atual:");
			ano = Integer.parseInt(aux);
			aux = JOptionPane.showInputDialog("Digite o ano de seu nascimento:");
			nasc = Integer.parseInt(aux);
			
			JOptionPane.showMessageDialog(null,
					"Voc� nasceu no ano de: " + nasc +
					"\nEstamos no ano de: " + ano +
					"\nLogo voc� tem: " + (ano - nasc) + " anos!"
					);
			
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "Formato de n�mero incorreto");
		}
	}

}
