package Atividade3;

public class Lista {

	private Object[] lista;
	private int posicaoLista;
	
	public Lista(int celulas) {
		this.posicaoLista = -1;
		this.lista = new Object[celulas];
	}
	
	public boolean listaVazia() {
        if (this.posicaoLista == -1) {
            return true;
        }
        return false;
    }
	
	public int tamanho() {
        if (this.listaVazia()) {
            return 0;
        }
        return this.posicaoLista + 1;
    }
	
	public void addValor(int valor) {
		this.posicaoLista += 1;
		this.lista[posicaoLista] = valor;
	}
	
	public Object exibeValorIndice(int indice) {
        if (this.listaVazia()) {
            return null;
        }
        return this.lista[indice];
    }
	
	public Object pegarValorIndice(int indice) {
		if (this.listaVazia()) {
			return null;
		} else {
		Object aux = this.lista[indice];
		for (int i=indice; i < tamanho()-1 ; i++) {
			this.lista[i]=this.lista[i+1];
		}
		this.posicaoLista--;
		return aux;
	}}
	
	public Object exibirListaFormatada() {
		String Formatado = "Lista: ";
		if (this.listaVazia())
			Formatado += "null";
		for (int i=0; i < tamanho(); i++) {
			if(i == 0) {
				Formatado += "[ " + exibeValorIndice(i) + ", ";
			} else {
			if (i < tamanho()-1) {
				Formatado += exibeValorIndice(i) + ", ";
			} else {
				Formatado += exibeValorIndice(i) + " ]";
			}
			}
		}
		return Formatado;
	}
}
