package exercicio1;

import java.util.Scanner;

public class ex9 {
 
	public static void main(String[]args) {
		
		int numerador;
		int denominador;
		
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Digite um valor: ");
		numerador = scan.nextInt();
		System.out.print("Dividido por: ");
		denominador = scan.nextInt();
		scan.close();
		
		
		if (denominador == 0) {
			
			System.out.print("Erro, Denominador é igual a Zero!");
		}
		else { 
			
		System.out.print(numerador / denominador);
		
	    	}
    	}
  }
