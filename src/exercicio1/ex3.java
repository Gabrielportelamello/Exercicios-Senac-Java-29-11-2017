package exercicio1;

import java.util.Scanner;

public class ex3 {
	
	public static void main(String[]args) {
		
		int valor1;
		int valor2;
	
	
	Scanner scan = new Scanner(System.in);
	System.out.print("Digite o Primeiro Numero: ");
	valor1 = scan.nextInt();
	
	System.out.print("Digite o Segundo Número: ");
	valor2 = scan.nextInt();
	scan.close();
	
	if (valor1 % valor2 == 0) {
		System.out.println("é Multiplo!");
		
	}
	else 
		System.out.println("Não é Multiplo!");
		
	
	}
}
