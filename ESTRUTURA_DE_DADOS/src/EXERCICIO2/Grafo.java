package EXERCICIO2;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Grafo {
	ArrayList<nos_cidades> cid = new ArrayList<nos_cidades>();

	public void AdicionarCidade(nos_cidades c) {
		this.cid.add(c);
	}

	public ArrayList<nos_cidades> getCid() {
		return this.cid;
	}	
	
}
