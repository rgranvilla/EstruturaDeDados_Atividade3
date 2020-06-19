package Atividade3;

public class Fila {
	
	private Object[] fila;
	private int posicaoFila;
	
	public Fila(int celulas) {
		this.posicaoFila = -1;
		this.fila = new Object[celulas];
	}
	
	public boolean filaVazia() {
        if (this.posicaoFila == -1) {
            return true;
        }
        return false;
    }
	
	public int tamanho() {
        if (this.filaVazia()) {
            return 0;
        }
        return this.posicaoFila + 1;
    }
	
	public Object exibePrimeiroValor() {
        if (this.filaVazia()) {
            return null;
        }
        return this.fila[0];
    }
	
	public Object removerPrimeiro() {
        if (filaVazia()) {
            return null;
        }
        Object aux = this.fila[0];
        for (int i=0; i< tamanho()-1; i++) {
        	this.fila[i]=this.fila[i+1];
        }
        this.posicaoFila--;
        return aux;
    }
	
	public void emfilerar(Object valor) {
        if (this.posicaoFila < tamanho()) {
            this.fila[++posicaoFila] = valor;
        }
    }
	
	public Object exibeValorIndice(int indice) {
        if (this.filaVazia()) {
            return null;
        }
        return this.fila[indice];
    }
	
	public Object exibirFilaFormatada() {
		String Formatado = "Fila: ";
		if (filaVazia())
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
