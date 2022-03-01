package PrimeirosExerciciosJava;

import java.util.Scanner;

public class SwitchCase {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String classificacao = "";
        System.out.println("Digite a nota do aluno e ela será classificada:");

        int nota = scan.nextInt();

        switch (nota) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                classificacao = "Poxa, você está de recuperação!";
                break;

            case 6:
            case 7:
                classificacao = "Excelentes notas, mas ainda pode melhorar!";
                break;
            case 8:
            case 9:
            case 10:
                classificacao = "Parabéns pelo esforço, continue assim!";
                break;
            default:
                classificacao = "Por favor, informe uma nota válida!";

        }
        System.out.println(classificacao);
        scan.close();
    }
}