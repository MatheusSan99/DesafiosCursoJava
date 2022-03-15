package Carro.Desafio;
// Criar 2 carros, 1 normal e 1 especial que recebam velocidades de aceleração distintas.
public class CarroTeste {
    public static void main(String[] args) {
        Carro c1 = new Hb20();
        Carro c2 = new Ferrari();

        c1.Acelerar();
        c1.Acelerar();
        c1.Acelerar();
        System.out.println(c1.FormatacaoVelocidade());
        c2.Acelerar();
        c2.Acelerar();
        c2.Acelerar();
        System.out.println(c2.FormatacaoVelocidade());
    }
}
