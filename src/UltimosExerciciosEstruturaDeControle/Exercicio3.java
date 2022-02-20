package UltimosExerciciosEstruturaDeControle;

import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        /*
        Criar um programa que receba duas notas parciais, calcular a média final.
        Se a nota do aluno for maior ou igual a 7.0 imprime no console "Aprovado".
        Se a nota for menor que 7.0 e maior do que 4.0 imprime no console "Recuperação".
        Caso contrário imprime no console "Reprovado".
         */

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite a primeira nota: ");
        int nota1 = scan.nextInt();
        System.out.println("Digite a segunda nota: ");
        int nota2 = scan.nextInt();
        int media = (nota1 + nota2) / 2;

        if (nota1 >= 0 && nota1 <= 10)
            if (nota2 >= 0 && nota2 <= 10) {
                {
                    switch ((int) media) {
                        case 7, 8, 9, 10 -> {
                            System.out.println("Você está aprovado!");
                            break;
                        }
                        case 4, 5, 6 -> {
                            System.out.println("Você está de recuperação!");
                            break;
                        }
                        case 1, 2, 3 -> {
                            System.out.println("Você foi reprovado!");
                            break;
                        }
                        default -> {
                            System.out.println("Nota inválida");
                        }
                    }

                }

            }
        else {
            System.out.println("Digite um número válido (0-10)");
        }
    }


}
