package arrays.DesafioCompra;


import java.io.ObjectInputStream;
import java.util.ArrayList;

public class Cliente {
String nome;
        ArrayList<Compra> compras = new ArrayList<>();

    public Cliente(String nome) {
    }

    double obtervalorTotal () {
            double total = 0;

            for (Compra compra : compras) {
                total += compra.ObterValorTotal();
            }
            return total;

        }

    }



