package exercicio1;

import java.util.Scanner;

public class ex10 {

	public static void main(String[]args) {
		
		int salario;
		int prestacao;
		
		Scanner scan = new Scanner(System.in);
	    System.out.print("Digite o Valor do Sal�rio: ");
	    salario = scan.nextInt();
	    System.out.print("Digite o valor da Presta��o: ");
	    prestacao = scan.nextInt();
	    scan.close();
	    
	    if (prestacao >(20 * salario / 100)) {
	    	
	    	System.out.println("Empr�stimo n�o pode ser concedido.");
	    	 }
	    if (prestacao ==(20 * salario / 100)) {
	    	System.out.println("Empr�stimo em an�lise.");
	    }
	    
	    if(prestacao <(20 * salario / 100)) {
	    	
	    	System.out.println("Empr�stimo pode ser concedido");
	    }
	  
	    
	}
	    	
		
		
}