package codigolimpo;

import java.util.Scanner;

public class Exrc02Senha {

	public static void main(String[] args) {
		Scanner ler =new Scanner (System.in);
		double num1, num2, soma;// double é usado quando precisamos armazenar números 
		int senhaMestre, senhaTentativa;// int armazena valores inteiros, sem casas decimais

		System.out.println("cadastre uma senha (apenas numeros): ");//System serve como saida de armazenamento
                                                                    //para ser exibido o resultado no final
		senhaMestre = ler.nextInt();// declaração de uma variavel
		
		System.out.println("digite um numero: ");//System serve como saida de armazenamento
                                                     //para ser exibido o resultado no final
		num1 = ler.nextDouble();// declaração de uma variavel
		
		System.out.println("digite outro numero: ");//System serve como saida de armazenamento
                                                       //para ser exibido o resultado no final
		num2 = ler.nextDouble();// declaração de uma variavel
		
		soma = num1+num2;//  soma das variaveis
		
		System.out.println("digite sua senha para desbloquear:  "); //System serve como saida de armazenamento
                                                                    //para ser exibido o resultado no final
		senhaTentativa = ler.nextInt();// declaração de uma variavel
		
		if (senhaTentativa == senhaMestre) { //if é estrutura de decisão, verdadeiro ou falso
			System.out.println(" a soma é "+soma);//System serve como saida de armazenamento
                                                    //para ser exibido o resultado no final
		}
		if (senhaTentativa != senhaMestre) {//if é estrutura de decisão, verdadeiro ou falso
			System.out.println(" erro! senha incorreta");//System serve como saida de armazenamento
                                                         //para ser exibido o resultado no final

	}
		ler.close(); // encerramento do codigo, serve para salvar e fechar
		}
	}