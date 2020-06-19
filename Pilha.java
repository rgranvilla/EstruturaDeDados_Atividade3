package Atividade3;

public class Pilha {

		private Object[] pilha;
		private int posicaoPilha;
		
		public Pilha(int celulas) {
			this.posicaoPilha = -1;
			this.pilha = new Object[celulas];
		}
		
		public boolean pilhaVazia() {
	        if (this.posicaoPilha == -1) {
	            return true;
	        }
	        return false;
	    }
		
		public int tamanho() {
	        if (this.pilhaVazia()) {
	            return 0;
	        }
	        return this.posicaoPilha + 1;
	    }
		
		public Object exibeUltimoValor() {
			//top
	        if (this.pilhaVazia()) {
	            return null;
	        }
	        return this.pilha[this.posicaoPilha];
	    }
		
		public Object desempilhar() {
	        if (pilhaVazia()) {
	            return null;
	        }
	        Object aux = this.pilha[this.posicaoPilha--];
	        return aux;
	    }
		
		public void empilhar(Object valor) {
	        if (this.posicaoPilha < this.pilha.length - 1) {
	            this.pilha[++posicaoPilha] = valor;
	        }
	    }
		
		public Object exibeValorIndice(int indice) {
	        if (this.pilhaVazia()) {
	            return null;
	        }
	        return this.pilha[indice];
	    }
		
		public Object exibirPilhaFormatada() {
			String Formatado = "Pilha: ";
			if (pilhaVazia())
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
