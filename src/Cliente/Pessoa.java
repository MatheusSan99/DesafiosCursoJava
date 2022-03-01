package Cliente;

public class Pessoa {

    String nome;
    int peso;
    Pessoa(String nome, int peso) {
        this.nome = nome;
        this.peso = peso;
    }
    void Comer(Comer comida) {
        if (comida != null) {
            this.peso += comida.PesoDoPrato;
        }

    }
    String ola() {
        return "Olá, eu sou o " + nome + " e tenho " + peso;
    }
}
