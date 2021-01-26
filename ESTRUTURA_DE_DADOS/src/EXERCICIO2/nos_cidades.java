package EXERCICIO2;

import java.util.ArrayList;

public class nos_cidades {
	private int numero;
	private String nome;
	ArrayList<arresta> a;

	public nos_cidades(int nr, String n) {
		this.numero = nr;
		this.nome = n;
	}

	public void AdicionarArrestas(int n, int p) {
		arresta ar = new arresta(this.numero, n, p);
		this.a = new ArrayList<arresta>();
		a.add(ar);
	}

	@SuppressWarnings("unused")
	private ArrayList<arresta> getA() {
		return a;
	}

	@SuppressWarnings("unused")
	private void setA(ArrayList<arresta> a) {
		this.a = a;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String toString() {
		return nome;
	}
}
