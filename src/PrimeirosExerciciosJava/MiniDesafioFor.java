package PrimeirosExerciciosJava;

public class MiniDesafioFor {
    public static void main(String[] args) {


        for (int i = 10; i > 0; i -= 2) {

            for (int j = 0; j < 10; j++) {


                System.out.printf("[%d %d]", i, j);
            }
            System.out.println("");
        }
    }
}