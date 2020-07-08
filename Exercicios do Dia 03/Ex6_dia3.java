package JavaDia3;
import java.util.Scanner;

public class Ex6_dia3 {

	public static void main(String[] args)
	{
		
		Scanner leia = new Scanner (System.in);
		int num, soma=0, cont=0;
		double media;
        
		do
		{
			System.out.println("Digite um numero: ");
	        num = leia.nextInt();
	        soma = num+soma;
	        
	        if(num%3==0 && num!=0)
	        {
	        	cont++;
	        }
	        
		}
		while(num != 0);
		media=soma/cont;
		
		System.out.println("A soma dos números digitados é: "+soma);
		System.out.println("A media dos números digitados é: "+media);
			
	}

}
