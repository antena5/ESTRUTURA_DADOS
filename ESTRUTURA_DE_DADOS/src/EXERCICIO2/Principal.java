package EXERCICIO2;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Principal {
	public static void main(String[] args) {		
		ArrayList<nos_cidades> cd = new ArrayList<nos_cidades>();
		ArrayList<arresta> ar = new ArrayList<arresta>();

		nos_cidades c = new nos_cidades(0,"São Paulo");
		cd.add(c);
		nos_cidades c1 = new nos_cidades(1,"Rio de Janeiro");
		cd.add(c1);
		nos_cidades c2 = new nos_cidades(2,"Espírito Santo");
		cd.add(c2);
		
		//System.out.println("Cidades: (" + cd.listIterator()+ ")");
		
		c.AdicionarArrestas(1, 13);
		c1.AdicionarArrestas(0, 1324);
		c1.AdicionarArrestas(2, 32);
		c2.AdicionarArrestas(1, 32);
		
		Grafo g = new Grafo();
		g.AdicionarCidade(c);
		g.AdicionarCidade(c1);
		g.AdicionarCidade(c2);
		
		
		
		System.out.println("Número da lista "+cd.size());
		for(int i=0; i<3; i++) {
			System.out.println("Cidades: (" +g.getCid().get(i)+ ")");
		}
	}
}
