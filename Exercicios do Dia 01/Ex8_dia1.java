package PacoteJava;

import java.util.Scanner;

public class Ex8_dia1 {
	
	public static void main (String args [])
	{
		Scanner leia=new Scanner (System.in);
		double preco,pcdist,pcimp,precofinal;
		
		System.out.printf("Informe o valor do carro: ");
		preco = leia.nextDouble();
		
		pcdist=(preco*28)/100;
		pcimp=(preco*45)/100;
		
		precofinal=preco+pcdist+pcimp;

        System.out.println("O custo final é de: "+precofinal);
		
		
	}

}
