import java.util.Scanner;

public class Exercicio002 {
    public static void main(String[] args) {

        /* Criar um boolean - Trabalho terca e quinta - Se ambos forem confirmados, Comprarei uma TV de 50 polegadas
           Se só um for confirmado, comprarei uma TV de 32 polegadas, e em ambos casos positivos, levarei a familia
             pra tomar sorvete
            Se falhar familia fica mais saudavel por não ingerir doce kkk
         */
        Scanner scan = new Scanner(System.in);
        System.out.println("Algum trabalho deu certo?");
        String confirmado = scan.nextLine();
        confirmado = confirmado.replace("s", "S");
        confirmado = confirmado.replace("não", "Não");
        confirmado = confirmado.replace("nao", "Não");
        if (confirmado.equals("Sim")) {


            System.out.println("Quantos trabalhos deram certo? Digite 1 ou 2");
            String oneortwo = scan.nextLine();
            double oneortwo0 = Double.parseDouble(oneortwo);
            if (oneortwo0 == 1) {
                System.out.println("Ótimo, comprarei uma TV de 32 polegadas e levarei a familia para tomar sorvete!!");

            } else {
                System.out.println("Ótimo, comprarei uma TV de 50 polegadas e levarei a familia para tomar sorvete!");
            }
        }

        if
        (confirmado.equals("Não")) {
            System.out.println("Ficarei em casa e não comprarei a TV por enquanto!");
        }
    }

}