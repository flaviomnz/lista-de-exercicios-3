package flavioteste.company;

import java.util.Scanner;

public class exercicio1 {
    public static void main (String[] args){
       // Faça um Programa que peça dois números e imprima o maior deles.

        Scanner scanner = new Scanner(System.in);
        int num1, num2;

        System.out.println(" Digite dois número:");
        num1 = scanner.nextInt();
        num2 = scanner.nextInt();

        if(num1 > num2){
            System.out.println(" O maior número é o número " +num1);
        }
        else if(num2 > num1){
            System.out.println(" O maior número é o número " +num2);
        }


    }
}
