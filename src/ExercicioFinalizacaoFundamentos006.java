import java.util.Scanner;

public class ExercicioFinalizacaoFundamentos006 {
    //Criar um programa que resolve equações do segundo grau
    // (ax2 + bx + c = 0) utilizando a fórmula de Bhaskara. Use como exemplo a = 1, b = 12 e c = -13.
    // Encontre o delta.

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Digite o valor de a: ");
        int a = scan.nextInt();
        System.out.print("Digite o valor de b: ");
        int b = scan.nextInt();
        System.out.print("Digite o valor de c: ");
        int c = scan.nextInt();

     int  delta = (int) ((Math.pow(b,2)) -4 * a * c);
        System.out.println("O valor de delta é: " + delta);

        int x1 = (int) (((-b) + Math.sqrt(delta)) / (2 * a));
        System.out.println("O valor de x1 é: " + x1);

        int x2 = (int) (((-b) - Math.sqrt(delta)) / (2 * a));
        System.out.print("O valor de x2 é: " + x2);

    }
}
