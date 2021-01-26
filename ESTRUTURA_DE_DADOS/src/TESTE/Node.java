package TESTE;

public class Node{
	int dado;
	Node esq, dir;
	String LetraAlfabeto;
	
	public Node(int valor, String letra) {
		this.dado = valor;
		this.LetraAlfabeto = letra;
		this.esq = null;
		this.dir = null;
	}
	
	public String toString() {
		return LetraAlfabeto;
	}
}
