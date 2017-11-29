package exercicio1;

import java.util.Scanner;
public class ex8 {

	public static void main(String[]args) {
		
		int valor;
		
		
		Scanner scan =new Scanner(System.in);
		System.out.print("Digite um ano: ");
		valor = scan.nextInt();
		scan.close();
		
		if ( (valor % 4 == 0) || (valor % 100 != 0) && (valor % 400 == 0) ) {
			
			System.out.println("O Ano Informado é Bissexto!");
			
		}
		else {
			
			System.out.print("O Ano Informado Não É Bissexto");
		}
	}
	
}
