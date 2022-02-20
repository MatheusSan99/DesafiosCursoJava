package UltimosExerciciosEstruturaDeControle;

import java.util.Random;
import java.util.Scanner;

public class Exercicio6 {
    /*
     Jogo da adivinhação: Tentar adivinhar um número entre 0 - 100.
     Armazene um numero aleatório em uma variável. O Jogador tem 10 tentativas para adivinhar o número gerado.
     Ao final de cada tentativa, imprima a quantidade de tentativas restantes,
     e imprima se o número inserido é maior ou menor do que o número armazenado.
     */
    public static void main(String[] args) {
        int contador = 10;
        Random gerador = new Random();
        Scanner scan = new Scanner(System.in);

        int numeroal = gerador.nextInt(100);
        System.out.println("Bem-vindo ao jogo, você tem 10 chances! ");
        System.out.println("tente acertar um número de 1 a 100");
        while (contador > 0) {

            int numero = scan.nextInt();
            contador--;

            if (numero > numeroal)
                System.out.println("Seu número é maior que o número aleatório");
            else if (numero < numeroal)
                System.out.println("Seu número é menor que o número aleatório");

            else {
                System.out.println("Parabéns, você acertou!");

            }
            System.out.println(" Você ainda tem " + contador + " chances.");
        }
    }
}