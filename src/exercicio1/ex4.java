package exercicio1;

import java.util.Scanner;

public class ex4 {

	
	public static void main(String[]args) {
	
	int valor;
	
	Scanner scan = new Scanner(System.in);
	System.out.print("Digite um N�mero: ");
	valor = scan.nextInt();
	scan.close();
	
	if (valor == 0) {
		
		System.out.println("O Valor � Igual a Zero!");
	}
	if (valor < 0) {
		
		System.out.println("O Valor � Negativo!");
	}
	if (valor > 0) {
		
		System.out.println("O Valor � Positivo!");
	}
	
	}
}


