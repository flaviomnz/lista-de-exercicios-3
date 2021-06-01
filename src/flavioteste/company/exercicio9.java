package flavioteste.company;

import java.util.Scanner;

public class exercicio9 {
    public static void main(String[] args) {
        double num1, num2, num3;
        Scanner sc = new Scanner(System.in);
        System.out.println(" Digite três números: ");
        num1 = sc.nextDouble();
        num2 = sc.nextDouble();
        num3 = sc.nextDouble();

        if (num1 > num2 && num2 > num3){
            System.out.println(num1 + " " + num2 + " " + num3);
        }else if (num2 > num1 && num1 > num3){
            System.out.println(num2 + " " + num1 + " " + num3);
        }else if (num3 > num1 && num1 > num2){
            System.out.println(num3 + " " + num1 + " " + num2);
        }else if (num3 > num2 && num2 > num1){
            System.out.println(num3 + " " + num2 + " " + num1);
        }else if (num1 > num3 && num3 > num2){
            System.out.println(num1 + " " + num3 + " " + num2);
        }else if (num2 > num3 && num3 > num1){
            System.out.println(num2 + " " + num3 + " " + num1);
        }else{
            System.out.println(" Os números são iguais. ");
        }
    }
}
