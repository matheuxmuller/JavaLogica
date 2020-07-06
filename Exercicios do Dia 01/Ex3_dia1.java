package PacoteJava;

import java.util.Scanner;

public class Ex3_dia1 {

    public static void main(String[] args) {

        int segundos,horas,minutos,x;

        Scanner leia=new Scanner(System.in);

        System.out.println("Digite o tempo do evento em segundos: ");
        x = leia.nextInt();

        horas=x/3600;
        minutos=(x%3600) / 60;
        segundos=(x%3600) % 60;

        System.out.println("\nHoras: " + horas);
        System.out.println("\nMinutos: " + minutos);
        System.out.println("\nSegundos: " + segundos);

    }
    
}