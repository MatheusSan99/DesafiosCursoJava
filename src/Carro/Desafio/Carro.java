package Carro.Desafio;

public class Carro {
    int velocidade = 0;
    int Multiplicador = 15;
    void Frear() {
        if (velocidade >= 5) {
            velocidade -= 5;
        } else {
            velocidade = 0;
        }
    }
    void Acelerar() {
        if (velocidade >= 0) {
             velocidade += 5;
        }
    }
    String FormatacaoVelocidade() {
        return "A sua velocidade atual é: " + velocidade + " Km/h ";
    }

}
