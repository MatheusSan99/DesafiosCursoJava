package UltimosExerciciosEstruturaDeControle;

import java.util.Scanner;

public class Exercicio4 {
    //Criar um programa que receba um número e diga se ele é um número primo.
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Digite um número e eu verificarei se ele é primo! ");
        int np = scan.nextInt();
        int divisor = 0;

        for(int i = 2; i < np; i++) {
            if (np % i == 0)
                divisor++;
        }
        if (divisor == 0 ) {
            System.out.println("Seu número é primo!");
        }
        else {
            System.out.println("Seu número não é primo!");
        }

    }
}