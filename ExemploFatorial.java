package codigolimpo;

import java.util.Scanner;

public class ExemploFatorial {

	public static void main(String[] args) {
		Scanner ler =new Scanner (System.in);
		int fat = 1, num; // declaração de uma variavel
		
		System.out.print("infrome o fatorial");//System serve como saida de armazenamento
                                               //para ser exibido o resultado no final
		num = ler.nextInt();// declaração de uma variavel
		
		if (num < 0) { //if é estrutura de decisão, verdadeiro ou falso
			System.out.print("nao existe fatorial de numero negativo");
				
		}
		if (num > 0){ //if é estrutura de decisão, verdadeiro ou falso
			for (int i = 1 ; i <= num ; i++) { // for é uma ferramaneta de controle de excução de repetição
				fat *= i;
			
			}
			System.out.println("o fatorial de "+ num +"é:"+ fat ); //System serve como saida de armazenamento
			                                                       //para ser exibido o resultado no final
		
		ler.close();// encerramento do codigo, serve para salvar e fechar 
		}
	}

}
