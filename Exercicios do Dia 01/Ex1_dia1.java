package PacoteJava;

import java.util.Scanner;

public class Ex1_dia1 {
	
	public static void main (String args [])
	{
		Scanner leia=new Scanner (System.in);
		int ano,mes,dia;
		double totaldias;
		
		System.out.printf("Entre com a sua idade em anos: ");
		ano = leia.nextInt();
		
		System.out.printf("\nEntre com a sua idade em meses: ");
		mes = leia.nextInt();
		
		System.out.printf("\nEntre com a sua idade em dias: ");
		dia  = leia.nextInt();
		
		totaldias=((ano*365)+(mes*30)+dia);
		
		System.out.printf("\nSua idade em dias é: "+totaldias);
	}

}
