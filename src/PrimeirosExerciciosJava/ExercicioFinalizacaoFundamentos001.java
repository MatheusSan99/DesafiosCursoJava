package PrimeirosExerciciosJava;

import java.util.Scanner;

public class ExercicioFinalizacaoFundamentos001 {

    public static void main(String[] args) {
        //Criar um programa que leia a temperatura em Celsius e converta para Fahrenheit.

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite a temperatura atual, e ela será convertida para Fahrenheit! ");
        int celsius = scan.nextInt();

        double F = (celsius * 9/5) + 32;
        System.out.println("A temperatura em Fahrenheit é: " + F + "°");

    }
}
