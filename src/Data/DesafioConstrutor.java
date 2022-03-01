package Data;

public class DesafioConstrutor {
    int dia;
    int mes;
    int ano;


    DesafioConstrutor() {
        dia = 1;
        mes = 1;
        ano = 1970;

    }
    DesafioConstrutor(int dia1, int mes1, int ano1) {
        dia = dia1;
        mes = mes1;
        ano = ano1;
    }
    String format() {
        return dia + "/" + mes + "/" + ano;
    }
    void imprimir() {
        System.out.println(format());
    }

}

