package Numeros;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;

public class aplicNumber3 {
    public static void main(String[] args) {
        double number1 = 080086.030;

        DecimalFormat nf1 = new DecimalFormat("00000.000");
        nf1.setGroupingUsed(true);
        DecimalFormatSymbols simb1 = new DecimalFormatSymbols();
        simb1.setDecimalSeparator('-');
        nf1.setDecimalFormatSymbols(simb1);
        String string1 = nf1.format(number1);
        System.out.println("Cep: "+ string1);

        double number2 = 099068849.09;

        DecimalFormat nf2 = new DecimalFormat("000,000,000.00");
        nf2.setGroupingUsed(true);
        DecimalFormatSymbols simb2 = new DecimalFormatSymbols();
        simb2.setDecimalSeparator('-');
        nf2.setDecimalFormatSymbols(simb2);
        String string2 = nf2.format(number2);
        System.out.println("CPF: "+ string2);
    }
}
