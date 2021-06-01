package flavioteste.company;

import java.util.Scanner;

public class exercicio2 {
    public static void main (String[] args){
        //Faça um Programa que peça um valor e mostre na tela se o valor é positivo ou negativo.
        System.out.println(" Digite um valor ");
        Scanner scanner = new Scanner(System.in);
        int valor = 0;
        valor = scanner.nextInt();

        if (valor > 0){
            System.out.println("O valor "+valor+" é positivo.");
        }
        else if (valor < 0 ){
            System.out.println("O valor "+valor+" é negativo.");
        }
    }
}
