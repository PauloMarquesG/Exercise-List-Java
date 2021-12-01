package Numeros;

import java.text.DecimalFormat;

public class aplicNumber2 {
    public static void main(String[] args) {
        double number1=12345679.0;

        //formato decimal
        DecimalFormat nf1 = new DecimalFormat("00000.00");
        String string1 = nf1.format(number1);
        System.out.println(string1);

        //formato decimal com separador de milhar
        DecimalFormat nf2 = new DecimalFormat("000,000,000.00");
        nf2.setGroupingUsed(true);
        String string2 = nf2.format(number1);
        System.out.println(string2);
    }
}
