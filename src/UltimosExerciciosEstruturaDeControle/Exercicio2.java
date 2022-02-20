package UltimosExerciciosEstruturaDeControle;

import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
//        Criar um programa que informa se o ano atual é um ano bissexto;

        Scanner scan = new Scanner(System.in);
        System.out.println("Digite um ano e eu verificarei se ele é bissexto!");
        int ano = scan.nextInt();

        if (ano <= 0) {
            System.out.println("Digite um número válido");
        }

        if (ano % 4 == 0) {
            System.out.println("Seu ano é bissexto");
        }
        else if (ano % 4 == 1){
            System.out.println("Seu ano não é bissexto");
        }
    }
}
