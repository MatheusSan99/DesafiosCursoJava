package PrimeirosExerciciosJava;

import java.util.Scanner;

public class ExercicioFinalizacaoFundamentos004 {

    //Criar um programa que leia um valor e apresente os resultados ao quadrado e ao cubo do valor.

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite um número e exibirei o número elevado ao quadrado e ao cubo.");
        double numero = scan.nextDouble();

        double quad = Math.pow(numero,2);
        double cubo = Math.pow(numero,3);

        System.out.print("Seu número é " + numero + "\n Seu número ao quadrado é: "
                + quad + "\n Seu número ao cubo é: " + cubo);
    }
}
