package UltimosExerciciosEstruturaDeControle;

import java.util.Scanner;

public class Exercicio8 {
    //Criar um programa que receba uma palavra e imprime no console letra por letra.
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite uma palavra e eu soletrarei ela!");
        String palavra = scan.next();

        char[] letras = palavra.toCharArray();

        for (int i = 0; i < letras.length; i++) {
            System.out.println(letras[i]);
        }

        scan.close();
    }
}


