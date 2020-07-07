package PacoteJava2;

import java.util.Scanner;

public class Ex3_dia2 {

	public static void main(String[] args)
	   {
	        Scanner leia = new Scanner (System.in);
	        int idade;
	        
	        System.out.printf("Entre com a sua idade: ");
	        idade = leia.nextInt();
	        
	        if(idade >= 10 && idade <=14)
	        {
	        	System.out.printf("Sua idade se enquadra na categoria Infantil");
	        }
	        
	        else if(idade >= 15 && idade <=17)
	        {
	        	System.out.printf("Sua idade se enquadra na categoria Juvenil");
	        }
	        else if (idade >= 18 && idade <=25)
	        {
	        	System.out.printf("Sua idade se enquadra na categoria Adulto");
	        }
	        else
	        {
	        	System.out.printf("Sua idade não se enquadra em nenhuma categoria");
	        }
	    }

}