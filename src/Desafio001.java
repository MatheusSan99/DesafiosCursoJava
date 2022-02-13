import org.w3c.dom.ls.LSOutput;

import javax.swing.*;
import java.time.format.DecimalStyle;
import java.util.Scanner;

public class Desafio001 {


        public static void main(String[] args) {

        String Sal01;
        String Sal02;
        String Sal03;

            //A partir do Scanner(ou JOption), pegar 3 Strings com next line, recebendo os 3 últimos
            //salários do funcionário, o usuário poderá separar as casas decimais com "," ou "."
            //somar os 3 últimos salários e fornecer a média.


             Sal01 = JOptionPane.showInputDialog("Digite o primeiro salário");
             Sal01 = Sal01.replace(",",".");
             Sal02 = JOptionPane.showInputDialog("Digite o primeiro salário");
             Sal02 = Sal02.replace(",",".");
             Sal03 = JOptionPane.showInputDialog("Digite o primeiro salário");
             Sal03 = Sal03.replace(",",".");

             double Sal1 = Double.parseDouble(Sal01);
             double Sal2 = Double.parseDouble(Sal02);
             double Sal3 = Double.parseDouble(Sal03);

             double soma = Sal1+Sal2+Sal3;
             double media = soma/3;

            System.out.println(String.format("O funcionário recebeu nos últimos 3 salários o valor de R$ " + "%.2f",soma));
            System.out.println(String.format("A media salarial dos últimos 3 meses do funcionários é R$ " +  "%.2f",media));


    }
}
