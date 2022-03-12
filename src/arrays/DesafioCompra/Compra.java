package arrays.DesafioCompra;

import java.util.ArrayList;

public class Compra {
String novoCliente;

  ArrayList<arrays.DesafioCompra.Item> Itens1 = new ArrayList<>();


  void adicionarItem(Produto p, int qtd) {
      this.Itens1.add(new Item(p,qtd));
  }
  void adicionarItem(String nome, double preco, int qtde) {
      var produto = new Produto(nome, preco);
      this.Itens1.add(new Item(produto,qtde));

  }
  double ObterValorTotal() {
      double total = 0;
      for (Item item: Itens1) {
          total += item.quantidade * item.produto.preco;
      }
      return  total;
  }

    }

