package codigolimpo;

import java.util.Scanner;

public class Exrc03Juntavetores {

	public static void main(String[] args) {
			
		Scanner ler =new Scanner (System.in);
		int a[] = new int [2];
		int b[] = new int [2];
		int c[] = new int [4];
		// int armazena valores inteiros, sem casas decimais
		// new int inicia a coluna
		
		System.out.println("veto 1");//System serve como saida de armazenamento
		for (int i=0; i<2; i++) {// for é uma ferramaneta de controle de excução de repetição
			System.out.println("informe o "+ i +"° valor..: ");
			a[i] =ler.nextInt();
			
		}
		System.out.println("veto 2");//System serve como saida de armazenamento
		for (int i=0; i<2; i++) {// for é uma ferramaneta de controle de excução de repetição
			System.out.println("informe o "+ i +"° valor..: ");
			b[i] =ler.nextInt();
			
			c [i] = a[i] ;
			c [i+2] = b[i] ;
		}
		System.out.println("vetor 3");//System serve como saida de armazenamento
		for (int i=0; i<4; i++) {// for é uma ferramaneta de controle de excução de repetição
			System.out.println("informe o "+ i +"° valor..: " + c[i]);//System serve como saida de armazenamento
		}
		ler.close();
		
		
	}
}
