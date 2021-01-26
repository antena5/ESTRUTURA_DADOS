package EXERCICIOS;


public class EXERCICIO3 {
	static int M[][] = new int[3][3]; 
	String tipo;
	int i=0, j = 0, contador=0; 
	
	
	
public static void main(String[] args) {
	M[0][0] = 0;
	M[0][1] = 12;
	M[0][2] = 6;
	M[1][0] = 12;
	M[1][1] = 0;
	M[1][2] = 8;
	M[2][0] = 6;
	M[2][1] = 8;
	M[2][2] = 0;
	
	for(int i=0; i < 3; i++) {
		for(int j=0; j < 3; j++) {
			if(M[i][j]>0) {
				System.out.println("Par: ("+i+","+j+") = "+M[i][j]);
				}
			}
		}
	}
}	
	

