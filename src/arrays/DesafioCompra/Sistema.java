package arrays.DesafioCompra;

public class Sistema  {
    public static void main(String[] args) {




Compra compra1 = new Compra();
compra1.adicionarItem("lapis",2,3);
compra1.adicionarItem(new Produto("manteiga",5),3);

Cliente cliente = new Cliente("Matheus");
cliente.compras.add(compra1);

        System.out.println(cliente.obtervalorTotal());
}
}
//Meu Deus essa parte de POO está bem complicada kkkkkkkkkkkkkkk, mas vamos nessa !!