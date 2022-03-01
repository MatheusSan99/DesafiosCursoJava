package Data;

public class ProdutoDesafio {

    String nome;
    double preco;
    static double desconto = 0.25;

    ProdutoDesafio() {

    }
    ProdutoDesafio(String nomeinicial, double precoinicial) {
        nome = nomeinicial;
        preco = precoinicial;


    }
    double precoComDesconto() {
        return preco *(1 - desconto);
    }
    double precoComDesconto(double descontodoGerente) {
        return preco * (1 - desconto + descontodoGerente);
    }


}


