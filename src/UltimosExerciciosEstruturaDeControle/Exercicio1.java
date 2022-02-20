package UltimosExerciciosEstruturaDeControle;

import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {

        //Criar um programa que receba um número e verifique se ele está entre 0 e 10 e é par;
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite um número entre (0 - 10) eu verificarei se ele é par!");
        int num = scan.nextInt();

        if (num % 2 == 0) {
            System.out.println("Seu número é par!");
        } else if (num % 2 == 1) {
            System.out.println("Seu número é ímpar!");

        } if (num >= 0 && num <= 10) {
            System.out.println("Seu número está dentro do limite");
        } else {
                System.out.println("Seu número está fora dos limites!");
        }
    }
}

