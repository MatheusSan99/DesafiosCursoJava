import java.util.Scanner;

public class ExercicioFinalizacaoFundamentos002 {

    //Criar um programa que leia a temperatura em Fahrenheit e converta para Celsius.
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite a temperatura em Celsius e ela será convertida para Celsius! ");
        int f = scan.nextInt();

        double C = (f - 32) * 5/9;

        System.out.println("A temperatura atual em Celsius é de: " + C + "°");
    }
}
