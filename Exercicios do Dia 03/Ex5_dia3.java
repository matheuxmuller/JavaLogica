package JavaDia3;
import java.util.Scanner;

public class Ex5_dia3 {

	public static void main(String[] args)
	{
		
		Scanner leia = new Scanner (System.in);
		int num, soma=0;
        
		do
		{
			System.out.println("Digite um numero: ");
	        num = leia.nextInt();
	        
	        soma = num+soma;
		}
		while(num != 0);
		System.out.println("A soma dos números digitados é: "+soma);
			
	}

}
