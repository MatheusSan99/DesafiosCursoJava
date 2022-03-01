package PrimeirosExerciciosJava;

import java.io.IOException;

import java.text.DecimalFormat;
import java.util.Scanner;

public class ExercicioDio {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);


        DecimalFormat df = new DecimalFormat("0.00");

        double A = scan.nextDouble();

        double B = scan.nextDouble();

        double valorAtual = ((B - A) * 100) / A;

        System.out.println(df.format(valorAtual) + "%");


    }
}
