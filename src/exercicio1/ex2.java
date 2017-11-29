package exercicio1;

import java.util.Scanner;

public class ex2 {

	public static void main(String[]args) {
		
		int valor;
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Digite um Valor: ");
        valor = scan.nextInt();
        scan.close();
        if (valor % 2 == 0) {
        	
        	System.out.println("Valor é par");
        	}
        	else {
        		System.out.println("O Valor é impar");
        }
       
		
	}
}
