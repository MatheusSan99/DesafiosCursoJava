package PrimeirosExerciciosJava;

import javax.swing.*;
import java.util.Scanner;

public class DesafioNotaValida {

    /*
    Anotar notas de 1 a 10 e notas inválidas
    Somar e fazer a média das notas validas e mostrar quantas notas são válidas e quantas não são.
    Fazer uma funcão de saida quando o usuário digitar "-1".
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
   double nota = 0, reserva = 0, media = 0;
int qntinvalidos = 0, qntvalidos = 0;

        while (nota != -1) {

            System.out.println("Digite uma nota: ");
            int numero = scan.nextInt();
            nota = numero;

            //armazenagem do número
            if (numero > 0 && numero <= 10) {
                reserva += numero;
                ++qntvalidos;
            }
            else if (numero >= 11) {
                System.out.println("Digite um número válido ( 0 a 10 )");
                ++qntinvalidos;
            } else if (numero <= -2) {
                System.out.println("Digite um número válido ( 0 a 10 )");
                ++qntinvalidos;
            }
        media = reserva/qntvalidos;

        }
        System.out.printf("Você digitou " + qntvalidos+ " números válidos, "
                + " resultando na média " + (String.format("%.1f",media)+ " você também digitou " + qntinvalidos + " números inválidos."));
}
    }


