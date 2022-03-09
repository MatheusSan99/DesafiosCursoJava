package arrays;

public class CompraTeste {
    public static void main(String[] args) {

        Compra compra1 = new Compra();
        compra1.cliente = "Matheus";
        compra1.itens.add(new Item("Bolacha",3,2.99));
        compra1.itens.add(new Item("Salgadinho",5,4.99));


        System.out.print(compra1.obterValorTotal());
        }
    }

