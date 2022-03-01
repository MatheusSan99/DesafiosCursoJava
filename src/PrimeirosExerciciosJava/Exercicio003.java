package PrimeirosExerciciosJava;

import java.util.Scanner;

public class Exercicio003 {

    public static void main(String[] args) {
        //Ler dois números e executar uma das quatro operações aritméticas básicas.
        Scanner scan = new Scanner(System.in);


        System.out.println("Digite o primeiro número: ");
        Double n1 = scan.nextDouble();
        System.out.println("Digite o segundo número: ");
        Double n2 = scan.nextDouble();

        System.out.println("Especifique a operação aritmética: + | - | * | / ");
        String operador = scan.next();

        double resultado = "+".equals(operador) ? n1 + n2 : 0;
        resultado = "-".equals(operador) ? n1 - n2 : resultado;
        resultado = "*".equals(operador) ? n1 * n2 : resultado;
        resultado = "/".equals(operador) ? n1 / n2 : resultado;
        resultado = "%".equals(operador) ? n1 % n2 : resultado;

        System.out.printf(n1 + operador + n2 + " = " + resultado, "%.2f");
        scan.close();
    }


}
