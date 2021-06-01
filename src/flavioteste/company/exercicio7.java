package flavioteste.company;

import java.util.Scanner;

public class exercicio7 {
    public static void main(String[] args){
        double num1, num2, num3;
        Scanner sc = new Scanner(System.in);
        System.out.println(" Digite três números: ");
        num1 = sc.nextDouble();
        num2 = sc.nextDouble();
        num3 = sc.nextDouble();

        if(num1 > num2 && num1 > num3){
            System.out.println(" O número " + num1 + " é o maior");
        }else if (num2 > num1 && num2 >num3){
            System.out.println(" O número " + num2 + " é o maior");
        }else if(num3 > num1 && num3 > num2){
            System.out.println(" O número " + num3 + " é o maior");
        }else {
            System.out.println(" Os números são iguais");
        }
        if(num1 < num2 && num1 < num3){
            System.out.println(" O número " + num1 + " é o menor");
        }else if (num2 < num1 && num2 < num3){
            System.out.println(" O número " + num2 + " é o menor");
        }else if(num3 < num1 && num3 < num2){
            System.out.println(" O número " + num3 + " é o menor");
        }

    }
}
