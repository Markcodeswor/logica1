package br.com.marcos;
import java.util.Scanner;


public class aprovado1 {
    public static void main(String [] args) {
        Scanner entrada = new Scanner(System.in);

        int nota1 = 10;
        int nota2 = 9;
        int nota3 = 7;
        int nota4 = 6;


        System.out.print(" Qual foi o valor da nota 1 ? ");
        nota1 = entrada.nextInt();

        System.out.print(" Qual foi o valor da nota 2 ? ");
        nota2 = entrada.nextInt();

        System.out.print(" Qual foi o valor da nota 3 ? ");
        nota3 = entrada.nextInt();

        System.out.print(" Qual foi o valor da nota 4 ? ");
        nota4 = entrada.nextInt();


        int total = nota1 + nota2 + nota3 + nota4;
        int soma = total / 4;

        if (soma >= 8) {
            System.out.println("Voce foi aprovado");

        }

        if (soma <= 4) {
            System.out.print("Voce foi de Reprovado :( ");
        }



             else {
            System.out.print(" Voce ainda tem chance na Recuperação,Aproveite!! ");
        }

        }
    }

