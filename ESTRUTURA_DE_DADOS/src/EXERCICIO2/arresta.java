package EXERCICIO2;

import java.util.ArrayList;

public class arresta {
	private int origem;
	private int destino;
	private int peso;

	public arresta(int o, int d, int p) {
		this.origem = o;
		this.destino = d;
		this.peso = p;
	}

	public int getOrigem() {
		return origem;
	}

	public void setOrigem(int origem) {
		this.origem = origem;
	}

	public int getDestino() {
		return destino;
	}

	public void setDestino(int destino) {
		this.destino = destino;
	}

	public int getPeso() {
		return peso;
	}

	public void setPeso(int peso) {
		this.peso = peso;
	}
	
	public String toString() {
		ArrayList<nos_cidades> c = new ArrayList<nos_cidades>();
		for(int i=0; i<c.size(); i++) {
//		if(c.getNumero() == this.origem) {
//		return c.getNome();
		}
//		}
		return "Não encontrado!";
	}

}
