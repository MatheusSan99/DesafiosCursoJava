package Data;

public class Data00 {
    int dia;
    int mes;
    int ano;

    Data00() {
        dia = 1;
        mes = 1;
        ano = 1970;
    }
    Data00(int dia1, int mes1, int ano1) {
        dia = dia1;
        mes = mes1;
        ano = ano1;
    }

    String ObterDataFormatada() {
        return String.format("%d/%d/%d",dia,mes,ano);
    }
}
