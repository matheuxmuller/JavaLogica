package PacoteJava;

import java.util.Scanner;

public class Ex7_dia1 {
	
	public static void main (String args [])
	{
		Scanner leia=new Scanner (System.in);
		float a,b,c,d,e,f,x,y;
		
		System.out.printf("Entre com o valor de A: ");
		a=leia.nextFloat();
		
		System.out.printf("\nEntre com o valor de B: ");
		b=leia.nextFloat();
		
		System.out.printf("\nEntre com o valor de C: ");
		c=leia.nextFloat();
		
		System.out.printf("\nEntre com o valor de D: ");
		d=leia.nextFloat();
		
		System.out.printf("\nEntre com o valor de E: ");
		e=leia.nextFloat();
		
		System.out.printf("\nEntre com o valor de F: ");
		f=leia.nextFloat();
		
		x= ((c*e)-(b*f))/((a*e)-(b*d));
		y= ((a*f)-(c*d))/((a*e)-(b*d));
		
		System.out.printf("\nO valor de X é:"+x);
		System.out.printf("\nO valor de Y é:"+y);
		
	}

}