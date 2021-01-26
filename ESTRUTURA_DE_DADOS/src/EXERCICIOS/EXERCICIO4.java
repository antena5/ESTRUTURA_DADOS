package EXERCICIOS;

public class EXERCICIO4 {
	static int i=0, j=0;
	static int V[][] = new int[6][6];
	
	public static void main(String[] args) {
	System.out.println("MATRIZ DIAGONAL: ");
		V[0][0] = 0;
		V[3][1] = 1;
		V[4][0] = 1;
		V[4][1] = 1;
		V[5][2] = 1;
		V[5][3] = 1;
		System.out.println(" "+V[0][0]);
		for(i=1; i<V.length; i++) {
			for(j=0; j<=i; j++) {
				V[i][i-1] = 1;
				V[i][i] = 0;
				System.out.print(" "+V[i][j]);
			}
			System.out.println();
		}
	
	//REPLICANDO A MATRIZ
	System.out.println("\nMATRIZ COMPLETA: ");
	for(i=0; i<V.length; i++) {
		for(j=i; j<V.length; j++) {
			V[i][j]=V[5-i][5-j];
		}

	}

	for(i=0; i<V.length; i++) {
		for(j=0; j<V.length; j++) {
			System.out.print(" "+V[i][j]);
		}
		System.out.println();
	}
	
  }
}