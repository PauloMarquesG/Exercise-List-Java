package Data;

import java.util.Calendar;
import java.util.Date;

public class aplicData {
    public static void main(String[] args) {
        Calendar calendario1 = Calendar.getInstance();

        Date dataAtual = calendario1.getTime();
        System.out.println("Obter data do sistema: "+ dataAtual);
        System.out.println();

        calendario1.set(2019,8,30,15,30,50);
        Date data1 = calendario1.getTime();
        System.out.println("Obter data do sistema: "+ data1);
        System.out.println();

        calendario1.add(Calendar.YEAR,5);
        calendario1.add(Calendar.MINUTE, -30);
        Date dataNova = calendario1.getTime();
        System.out.println("Nova data: "+ dataNova);
    }
}
