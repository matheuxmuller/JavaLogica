package JavaDia4;

import java.util.Scanner;

public class Ex2_dia4 {
	
	public static void main (String args[])
	{	
		Scanner leia = new Scanner (System.in);
		
		int [] vetor = new int [6];
		int somapar=0, contimpar=0;
		
		
		for (int x=0; x < vetor.length; x++)
		{	
			System.out.println("Entre com os valores: ");
			vetor[x] = leia.nextInt();
			
			if(vetor[x]%2==0)
			{
				System.out.println("o número: "+vetor[x]+" é par");
				somapar+=vetor[x];
			}
			else
			{
				System.out.println("o número: "+vetor[x]+" é impar");
				contimpar++;
			}
		}
		System.out.println("\nA soma dos numeros pares digitados é: "+somapar);
		System.out.println("A quantidade dos numeros impares digitados é: "+contimpar);		
	}
}