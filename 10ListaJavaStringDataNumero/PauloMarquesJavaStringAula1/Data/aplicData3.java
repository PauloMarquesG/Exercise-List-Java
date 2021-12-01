package Data;

import java.text.SimpleDateFormat;
import java.text.DateFormat;
import java.util.Date;
import java.util.Calendar;

public class aplicData3 {
    public static void main(String[] args) {
        Calendar calendario1 = Calendar.getInstance();
        Date dataAtual = calendario1.getTime();
        System.out.println("Obter data do sistema: "+ dataAtual);

        SimpleDateFormat df1 = new SimpleDateFormat("YYYY-MM-dd");
        String dataForm1 = df1.format(dataAtual);
        System.out.println("Data formatada: "+ dataForm1);

        SimpleDateFormat df2 = new SimpleDateFormat("dd-MM-YYYY");
        String dataForm2 = df2.format(dataAtual);
        System.out.println("Data formatada: "+ dataForm2);
    }
}
