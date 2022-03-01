package Data;

import javax.xml.crypto.Data;

public class Data00Teste {
    public static void main(String[] args) {

        Data00 d0 = new Data00(); {
          //Método sem parâmetros.
        }
        Data00 d1 = new Data00(15,4,1999); {
        //Declaração do método com parâmetros
        }

        System.out.println(d0.ObterDataFormatada()+ "\n" + d1.ObterDataFormatada());
    }
}
