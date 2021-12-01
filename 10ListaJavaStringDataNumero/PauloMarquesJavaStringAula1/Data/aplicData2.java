package Data;

import java.text.DateFormat;
import java.util.Calendar;
import java.util.Date;

public class aplicData2 {
    public static void main(String[] args) {

        Calendar calendario1 = Calendar.getInstance();
        Date dataAtual = calendario1.getTime();
        System.out.println("Obter data do sistema: "+ dataAtual);
        System.out.println();

        DateFormat df1 = DateFormat.getDateInstance(DateFormat.SHORT);
        String dataForm1 = df1.format(dataAtual);
        System.out.println("Data formatada: "+ dataForm1);

        DateFormat df2 = DateFormat.getDateInstance(DateFormat.MEDIUM);
        String dataForm2 = df2.format(dataAtual);
        System.out.println("Data formatada: "+ dataForm2);

        DateFormat df3 = DateFormat.getDateInstance(DateFormat.LONG);
        String dataForm3 = df3.format(dataAtual);
        System.out.println("Data formatada: "+ dataForm3);

    }
}
