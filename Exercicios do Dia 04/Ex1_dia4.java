package JavaDia4;

public class Ex1_dia4 {
	
	public static void main (String args[])
	{	
		int [] a = {1, 0, 5, -2, -5, 7};
		int soma=0, x=0;
		
		System.out.println("\nValor Inicial de A[] s�o: 1, 0, 5, -2, -5, 7");

		for  (x = 0; x <= a.length; x++)
		{
			if(a[4]==-5)
			{
				a[4]=100;
			}
		}	
		soma = a[0]+a[1]+a[5];
		System.out.println("\nA soma das posi��es A[0], A[1] e A[5] �: "+soma);
		
		System.out.println("\nValor de A[0] �: "+a[0]);
		System.out.println("Valor de A[1] �: "+a[1]);
		System.out.println("Valor de A[2] �: "+a[2]);
		System.out.println("Valor de A[3] �: "+a[3]);
		System.out.println("Valor de A[4] �: "+a[4]);
		System.out.println("Valor de A[5] �: "+a[5]);
	}
}
