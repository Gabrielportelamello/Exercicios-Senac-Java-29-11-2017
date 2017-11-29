package exercicio1;

import java.util.Scanner;

public class ex7 {

	public static void main(String[]args) {
		
		int valor1;
		int valor2;
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Digite o primeiro valor: ");
		valor1 = scan.nextInt();
		System.out.print("Digite o segundo valor: ");
		valor2 = scan.nextInt();
		scan.close();
		
		if (valor1 > valor2) {
			
			System.out.println("O Primeiro Valor é Maior que o Segundo!");
			
		}
		if (valor1 == valor2) { 
			System.out.println("Os Valores São Iguais!");
		}
		if(valor1 < valor2) {
			System.out.println("O Segundo Valor é Maior que o Primeiro!");
			
			
		}
		
		
		
		
	}
}
