package EXERCICIOS;

import javax.swing.JOptionPane;

public class EXERCICIO1 {
	static int n, count = 0;
	static String tipo = null;

	public static void main(String[] args) {
		JOptionPane I = new JOptionPane();

		n = Integer.parseInt(I.showInputDialog("Digite o tamanho da matriz (AxB): "));

		int V[][] = new int[n][n];

		for (int i = 0; i < V.length; i++) {
			for (int j = 0; j < V.length; j++) {
				V[i][j] = Integer.parseInt(I.showInputDialog("Digite o valor da posição: " + i + ":" + j));
			}
		}

		arestas(V);
		System.out.println();
		vertices(V);
		System.out.println();
		lista(V);

	}

	public static void arestas(int v[][]) {
		for (int i = 0; i < v.length; i++) {
			for (int j = 0; j < v.length; j++) {
				if (v[i][j] > 0) {
					count += 1;
					System.out.println("Aresta (" + i + "," + j + ")");
					if (v[i][j] == v[j][i]) {
						tipo = "não direcionado";
					} else {
						tipo = "digrafo";
					}
				}
			}
		}
	}

	public static void vertices(int v[][]) {
		for (int i = 0; i < v.length; i++) {
			count = 0;
			System.out.print("V:" + i);
			for (int j = 0; j < v.length; j++) {
				if (v[i][j] > 0) {
					count += 1;
				}
			}
			System.out.println(" grau:" + count);
		}
		System.out.println();
		System.out.println("Grafo Tipo: " + tipo);

	}

	public static void lista(int[][] v) {
		for (int i = 0; i < v.length; i++) {
			System.out.print(i);
			for (int j = 0; j < v.length; j++) {
				if (v[i][j] > 0) {
					System.out.print(" >> " + j);
				}
			}
			System.out.println();
		}

	}
}
