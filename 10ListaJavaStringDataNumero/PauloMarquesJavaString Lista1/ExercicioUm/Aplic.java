package ExercicioUm;

import java.text.DateFormat;
import java.util.Calendar;
import java.util.Date;
import java.text.DecimalFormat;

public class Aplic {
    public static void main(String[] args) {

     //Produto 1
        System.out.print("1)");
        String produto1 = new String("Feijão ");
        produto(produto1);

        double peso1 = 2.5;
        peso(peso1);

        Calendar calendario1 = Calendar.getInstance();
        calendario1.set(2020,10,04);
        data(calendario1);

     //Produto 2
        System.out.print("2)");
        String produto2 = new String("Café ");
        produto(produto2);

        double peso2 = 1.0;
        peso(peso2);

        Calendar calendario2 = Calendar.getInstance();
        calendario2.set(2022, 01, 01);
        data(calendario2);

     //Produto 3
        System.out.print("3)");
        String produto3 = new String("Beterraba ");
        produto(produto3);

        double peso3 = 0.9;
        peso(peso3);

        Calendar calendario3 = Calendar.getInstance();
        calendario3.set(2017, 11, 12);
        data(calendario3);

    }

    public static  void data(Calendar calendario){
        Date data = calendario.getTime();
        DateFormat df = DateFormat.getDateInstance(DateFormat.SHORT);
        String dataForm = df.format(data);
        System.out.print(dataForm + "\n");
    }

    public static void peso(double peso){
        DecimalFormat nf = new DecimalFormat("000000.00");
        String StringP = nf.format(peso);
        System.out.print(StringP + " ");
    }

    public static void produto(String produto) {
        if (produto.length() <= 12) {
            int aux, x;
            aux = 12 - produto.length();
            for (x = 0; x <= aux; x++) {
                System.out.print(" ");
            }
            System.out.print(produto);
        }
    }
}
