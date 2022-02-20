import java.util.Scanner;

public class DesafioDiaDaSemana {

    //Quando o usuário digitar o dia da semana retornar o número em dia Ex: Domingo = 1.
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Escreva o dia da Semana: ");
        String DiaDaSemana = scan.next();

        if (DiaDaSemana.equalsIgnoreCase("Domingo")) {
            System.out.println("1");
        } else if (DiaDaSemana.equalsIgnoreCase("Segunda")) {
            System.out.println("2");
        } else if (DiaDaSemana.equalsIgnoreCase("Terca") ||
                DiaDaSemana.equalsIgnoreCase("Terça")) {
            System.out.println("3");
        } else if (DiaDaSemana.equalsIgnoreCase("Quarta"))
            System.out.println("4");
        else if (DiaDaSemana.equalsIgnoreCase("Quinta")) {
            System.out.println("5");
        } else if (DiaDaSemana.equalsIgnoreCase("Sexta"))
            System.out.println("6");
        else if (DiaDaSemana.equalsIgnoreCase("Sábado") ||
                DiaDaSemana.equalsIgnoreCase("Sabado")) {
            System.out.println("7");
        } else {
            System.out.println("Dia inválido");
        }

    }
}
