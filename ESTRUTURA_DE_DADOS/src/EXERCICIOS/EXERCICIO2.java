package EXERCICIOS;

import java.util.ArrayList;

import javax.swing.JOptionPane;



public class EXERCICIO2 {
	static int n;
	static ArrayList lista = new ArrayList();
	
	
	public static void main(String[] args) {
		
		JOptionPane I = new JOptionPane();
		n = Integer.parseInt(I.showInputDialog("INSIRA UM VALOR: "));
		
		int V[][] = new int[n][n];
		
		for(int i=0; i<V.length; i++) {
			System.out.print("{");
			for(int j=0; j<V[i].length; j++) {
				if(i==j) {
				V[i][j] = 0;
					}else {
						V[i][j] = 1;						
					}	
			System.out.print((V[i][j]));
			}
			System.out.println("}");
		}
		System.out.println();
		for(int i=0; i<V.length; i++) {
			System.out.print(i);
			for(int j=0; j<V[i].length; j++) {
				if(V[i][j]>0) {
					System.out.print(" >> "+j);
				}
			}
		System.out.println("");
		}
	}
}
