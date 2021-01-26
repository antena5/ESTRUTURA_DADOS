package TESTE;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		JOptionPane P = new JOptionPane();
		ArvoreBinaria A = new ArvoreBinaria(); 
		String letra = (P.showInputDialog("Digite uma letra: "));
		int valor = Integer.parseInt((P.showInputDialog(null, "Digite um valor: ")));
		
		A.inserirNode(valor, letra);
		
		System.out.println();
	}	
}
