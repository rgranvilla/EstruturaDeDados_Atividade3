package Atividade3;

public class InterfaceAtividade {

// Passo 1: Insira os números [1, 2, 3, 4 e 5] em uma lista - com 5 células;

	private static int numCelulasLista = 0;
	private static int numCelulasPilha = 0;
	private static int numCelulasFila = 0;

	public static void main(String[] args) {

		numCelulasLista = 5;
		Lista listaNumeros = new Lista(numCelulasLista);

		for (int i = 0; i < numCelulasLista; i++) {
			listaNumeros.addValor(i + 1);
		}

		System.out.println(listaNumeros.exibirListaFormatada());

// Passo 2: Remova todos os dados da lista e insira-os em uma Pilha - com 5 células.
// Deve-se sempre remover os dados da célula inicial da lista; 		
		
		numCelulasPilha = 5;
		Pilha pilhaNumeros = new Pilha(numCelulasPilha);
		
		while (!listaNumeros.listaVazia()){
			pilhaNumeros.empilhar(listaNumeros.pegarValorIndice(0));
		}
		
		System.out.println(listaNumeros.exibirListaFormatada());
		System.out.println(pilhaNumeros.exibirPilhaFormatada());
		
// Passo 3: Remova os dados da Pilha e insira-os em uma Fila - com 10 células);

		numCelulasFila = 10;
		Fila filaNumeros = new Fila(numCelulasFila);
		
//		System.out.println(filaNumeros.exibirFilaFormatada());
//		System.out.println(pilhaNumeros.exibirPilhaFormatada());
		
		while(!pilhaNumeros.pilhaVazia()) {
			filaNumeros.emfilerar(pilhaNumeros.desempilhar());
		}
		
		System.out.println(pilhaNumeros.exibirPilhaFormatada());
		System.out.println(filaNumeros.exibirFilaFormatada());
		
// Passo 4: Insira os números [6, 7, 8, 9 e 10] na lista;
		
		System.out.println(listaNumeros.exibirListaFormatada());
		
		for (int i = 0; i < numCelulasLista; i++) {
			listaNumeros.addValor(i+6);
		}
		
		System.out.println(listaNumeros.exibirListaFormatada());
		
// Passo 5: Repita os passos 2 e 3.		
		
		while (!listaNumeros.listaVazia()){
			pilhaNumeros.empilhar(listaNumeros.pegarValorIndice(0));
		}
		
		while(!pilhaNumeros.pilhaVazia()) {
			filaNumeros.emfilerar(pilhaNumeros.desempilhar());
		}
		
// Passo 6: Exiba todos os números que foram inseridos na fila. 
		
		System.out.println(listaNumeros.exibirListaFormatada());
		System.out.println(pilhaNumeros.exibirPilhaFormatada());
		System.out.println(filaNumeros.exibirFilaFormatada());
		
	}
}
