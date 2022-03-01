package Cliente;

public class Jantar {
    public static void main(String[] args) {
        Comer p1 = new Comer("ArrozComFrango", 0.300);

        Pessoa p = new Pessoa("Matheus",70);

        System.out.println(p.ola());
        p.Comer(p1);
        System.out.println(p.ola());



    }
}
