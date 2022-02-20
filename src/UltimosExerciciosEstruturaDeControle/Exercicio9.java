package UltimosExerciciosEstruturaDeControle;

import java.util.Scanner;

public class Exercicio9 {
    //Crie um programa que recebe 10 valores e ao final imprima o maior número.
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite 10 números e ao final exibirei o maior! ");
        int i = 10;
        int contador = 0;

        while (i != 0) {
            int numero = scan.nextInt();
            i--;
            if(numero > contador) {
                contador = numero;

            }
        }
        System.out.println("O maior número encontrado foi: " + contador);

    }
}
