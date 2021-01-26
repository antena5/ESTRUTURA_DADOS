package TESTE;

public class ArvoreBinaria {
	Node raiz;
	
	public ArvoreBinaria() {
		raiz = null;
	}
	
	public void inserirNode(int valor, String letra) {
		Node Novonode = new Node(valor, letra);
		if(raiz == null) {
			raiz = Novonode;
		}
		else {
			Node Auxiliar = raiz;
			Node Pai;
			while(true) {
			Pai = Auxiliar;
				if(valor < Auxiliar.dado) {
					Auxiliar = Auxiliar.esq;
					if(Auxiliar == null) {
						Pai.esq = Novonode;
						return;
					}	
				}else {
					Auxiliar = Auxiliar.dir;
					if(Auxiliar == null) {
						Pai.dir = Novonode;
						return;
					}
				}
			}
		}
	}
}
