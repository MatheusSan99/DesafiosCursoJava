package Data;

public class ProdutoDesafioTeste {
    public static void main(String[] args) {
        ProdutoDesafio p1 = new ProdutoDesafio("Notebook", 4500);

        var p2 = new ProdutoDesafio();
        p2.nome = "Celular";
        p2.preco = 1743.53;
        ProdutoDesafio.desconto = 0.30;

        System.out.println(p1.nome + "" + p1.precoComDesconto());
        System.out.println(p2.nome + "" + p2.precoComDesconto());

        double precoFinal1 = p1.precoComDesconto();
        double precoFinal2 = p2.precoComDesconto(0.1);
        double mediaCarrinho = (precoFinal1 + precoFinal2) / 2;

        System.out.printf("Média do carrinho = R$%.2f ", mediaCarrinho);
    }
}
