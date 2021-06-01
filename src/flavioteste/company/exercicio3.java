package flavioteste.company;

import java.util.Scanner;

public class exercicio3 {
    public static void main (String[] args){

        Scanner scanner = new Scanner (System.in);
        System.out.println(" Informe seu sexo, M/m - F/f");

        String sexo = scanner.next();
        if ("f".equalsIgnoreCase(sexo)) {
            System.out.println(" Sexo feminino selecionado. ");
        }
        else if ("m".equalsIgnoreCase(sexo)) {
            System.out.println(" Sexo maculino selecionado.");
        }

        else{
            System.out.println(" Sexo não identificado.");
        }
    }
}
