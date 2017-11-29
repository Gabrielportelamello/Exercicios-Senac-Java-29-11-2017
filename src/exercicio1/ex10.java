package exercicio1;

import java.util.Scanner;

public class ex10 {

	public static void main(String[]args) {
		
		int salario;
		int prestacao;
		
		Scanner scan = new Scanner(System.in);
	    System.out.print("Digite o Valor do Salário: ");
	    salario = scan.nextInt();
	    System.out.print("Digite o valor da Prestação: ");
	    prestacao = scan.nextInt();
	    scan.close();
	    
	    if (prestacao >(20 * salario / 100)) {
	    	
	    	System.out.println("Empréstimo não pode ser concedido.");
	    	 }
	    if (prestacao ==(20 * salario / 100)) {
	    	System.out.println("Empréstimo em análise.");
	    }
	    
	    if(prestacao <(20 * salario / 100)) {
	    	
	    	System.out.println("Empréstimo pode ser concedido");
	    }
	  
	    
	}
	    	
		
		
}