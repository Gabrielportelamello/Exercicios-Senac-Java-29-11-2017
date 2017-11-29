package exercicio1;

import java.util.Scanner;

public class ex5 {

	public static void main(String[]args) {
		
		int valor;
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Digite um Valor: ");
		valor = scan.nextInt();
	    scan.close();
	    
	    if (valor > 5 && (valor < 20)) {
	    	
	    System.out.println("O Valor está entre 5 e 20!");   	
	    }
	    else {
	    	
	    	System.out.println("O Valor Não Está entre 5 e 20!");
	    	
	    }
				
		
		
		
	}
}
