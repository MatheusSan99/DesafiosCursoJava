package UltimosExerciciosEstruturaDeControle;

import java.util.Scanner;

public class Exercicio7 {
    /*
    Criar um programa que enquanto estiver recebendo números positivos,
    imprime no console a soma dos números inseridos,
    caso receba um número negativo, encerre o programa. Tente utilizar a estrutura do while.
     */

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
       int contador = 0;
       int recebe = 0;

       while (contador >= 0) {
           System.out.println("Digite um número e será feita a somatória do mesmo! (Números negativos encerram a aplicação.");
           int numero = scan.nextInt();

           if (recebe <= numero) {
               recebe += numero;

               System.out.println("A soma dos valores atuais é: " + recebe);
           }
           contador = numero;
        }
    }
}
