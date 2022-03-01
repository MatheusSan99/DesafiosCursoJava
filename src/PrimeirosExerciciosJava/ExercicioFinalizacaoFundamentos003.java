package PrimeirosExerciciosJava;

import java.util.Scanner;

public class ExercicioFinalizacaoFundamentos003 {
//Criar um programa que leia o peso e a altura do usuário e imprima no console o IMC.

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o seu peso:");
        String peso = scan.next();

        System.out.println("Digite sua altura:");
        String alt = scan.next();

        peso = peso.replace(",", ".");
        alt = alt.replace(",", ".");

        double peso1 = Double.parseDouble(peso);
        double altura = Double.parseDouble(alt);

        int imc = (int) (peso1 / (Math.pow(altura, 2)));

        if (imc >= 40)
            System.out.println("Seu imc é: " + imc + ", Você está com obesidade Grau III, procure um médico.");
        else if (imc >= 35)
            System.out.println("Seu imc é: " + imc + ", Você está com obesidade Grau II, procure um médico.");
        else if (imc >= 30)
            System.out.println("Seu imc é: " + imc + ", Você está com Obesidade Grau I, procure um médico.");
        else if (imc >= 25)
            System.out.println("Seu imc é: " + imc + ", Você está com sobrepeso.");
        else if (imc >= 18.5)
            System.out.println("Seu imc é: " + imc + ", Parabéns, você está no peso ideal.");
        else {
            System.out.println("Seu imc é: " + imc + ", Você está abaixo do peso ideal.");
        }
    }
}

