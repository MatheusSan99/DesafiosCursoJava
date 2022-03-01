package Data;

public class DesafioConstrutorTeste {
    public static void main(String[] args) {

        DesafioConstrutor padrao = new DesafioConstrutor();

        var novo = new DesafioConstrutor(15,04,1999);

        String formatar = padrao.format();
        System.out.println(formatar);

        System.out.println(novo.format());

    }
}