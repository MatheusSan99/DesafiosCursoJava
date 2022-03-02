package arrays;

import java.lang.reflect.Array;

public class Exercicios {

    public static void main(String[] args) {
        
        double [] notasAlunoA = new double[3];

        notasAlunoA[0] = Math.random()*10;
        notasAlunoA[1] = Math.random()*10;
        notasAlunoA[2] = Math.random()*10;

        double total = 0;

        for (double nota : notasAlunoA)  // for each
        {
            System.out.printf("%.1f",nota );
            System.out.println("");
        }


        for (int i = 0; i < notasAlunoA.length; i++) {
            total += notasAlunoA[i];
        }
        double media = total/notasAlunoA.length;
        if (media > 7) {
            System.out.printf("O aluno teve a segunte média bimestral: %.1f ", media);
            System.out.print("\ne está aprovado! ");
        }
        else if (media > 5 && media < 7) {
            System.out.printf("O aluno teve a segunte média bimestral: %.1f ",media);
            System.out.print( "\n O aluno está de recuperação!");
        }
        else {
            System.out.printf("O aluno teve a segunte média bimestral: %.1f ",media);
            System.out.print("\n O aluno foi reprovado!");
        }

        }
    }

