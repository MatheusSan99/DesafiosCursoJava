package PrimeirosExerciciosJava;

public class Exercicio001 {

    //Organizar e quebrar o código
    public static void main(String[] args) {

        int e = 2;
        int div = (int) Math.pow(10,3);
        //pb = primeiro bloco.   //spb1 = segunda parte pb.  rpb = resultado primeiro bloco

        double pb = 6 * (3 + 2);
        double sbp1 = 3*2;
        double pb1 = (int) Math.pow(pb, 2);
        double rpb = pb1/sbp1;

        double sb = (1-5)*(2-7);
        double sb2 =  sb/2;
        double rsb = Math.pow(sb2,2);

        double resultadofinal = (rpb-rsb);
        double resultadofinal1 = Math.pow(resultadofinal,3);
        double resultadofinal2 = resultadofinal1/div;

        System.out.println(resultadofinal2);
    }

}
