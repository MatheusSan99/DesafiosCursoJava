package PrimeirosExerciciosJava;

import java.util.Scanner;

public class ExercicioFinalizacaoFundamentos005 {
    //Criar um programa que leia o valor da base e da altura de um triângulo e calcule a área.
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite a altura do triângulo: ");
        int altura = scan.nextInt();
        System.out.println("Digite a base do triângulo: ");
        int base = scan.nextInt();

        int area = (altura * base) / 2;

        System.out.println("A área do seu triângulo é: " + area);

    }
}
