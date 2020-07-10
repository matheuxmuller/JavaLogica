package JavaDia5;

import java.util.Scanner;

public class Ex3_dia5 {
	
	public static void main(String[] args) {

        Scanner leia = new Scanner(System.in);
        
        int num=0, cont1=0, cont2=0, cont3=0, cont4=0;
        
        while(true)
        {
        	System.out.println("Insira alguns números: ");
            num = leia.nextInt();
            
        	if(num >= 0 && num <=25)
        	{
        		cont1++;
        	}
        	else if(num >= 26 && num <=50)
        	{
        		cont2++;
        	}
        	else if(num >= 52 && num <=75)
        	{
        		cont3++;
        	}
        	else if(num >= 76 && num <=100)
        	{
        		cont4++;
        	}
        	else if(num <0)
        	{
        		break;
            }
        	}
        
        System.out.println("A quantidade de números na sequência [0-25] é: "+cont1);
        System.out.println("A quantidade de números na sequência [26-50] é: "+cont2);
        System.out.println("A quantidade de números na sequência [51-75] é: "+cont3);
        System.out.println("A quantidade de números na sequência [76-100] é: "+cont4);
}
}
