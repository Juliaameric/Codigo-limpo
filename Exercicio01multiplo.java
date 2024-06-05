package codigolimpo;

import java.util.Scanner;

public class Exercicio01multiplo {

	public static void main(String[] args) {
		Scanner ler =new Scanner (System.in);
		double valor; // double é usado quando precisamos armazenar números 

		System.out.println(" informe um valor :");
		valor = ler.nextDouble();// declaração de uma variavel

		if (valor % 5 == 0) {//if é estrutura de decisão, verdadeiro ou falso
			System.out.println(" o numero "+ valor + " é multiplo de 5");//System serve como saida de armazenamento
                                                                     //para ser exibido o resultado no final
		}

		if (valor % 5 !=0) { //if é estrutura de decisão, verdadeiro ou falso
			System.out.println("o numero "+ valor +"ñ é multiplo"); //System serve como saida de armazenamento
                                                               //para ser exibido o resultado no final
		}
		ler.close();// encerramento do codigo, serve para salvar e fechar 
	}
}


