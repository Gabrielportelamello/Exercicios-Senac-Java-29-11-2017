package exercicio1;

import java.util.Scanner;

public class ex1 {

	public static void main(String[]args) {
		
		int valor;
		
		Scanner scan = new Scanner(System.in);
	    System.out.print("Digite um Valor: ");
	    valor = scan.nextInt();
		scan.close();
		if(valor > 0) {
			System.out.println(valor);
			
			}
			
		if(valor < 0) {
			valor = (valor * -1);
			System.out.println(valor);
		}
		
		
		
		
	}
}
