package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ForEach {
    //Desafio: Criar um laço que receba os dados do usuario, armazene em um array e traga a média final

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite quantas notas você irá armazenar: ");
        int count = scan.nextInt();

        double[] notasAluno = new double[count];


        for (int i = 0; i < notasAluno.length; i++) {
            int soma;
            System.out.println("Informe a nota: " + (i + 1));
            notasAluno[i] = scan.nextDouble();

        }
double total = 0;
        for (double nota: notasAluno) {
            total += nota;
        }
        double media = total / notasAluno.length;
        System.out.println("A média é: " + media + " !" );
        scan.close();
    }
}
