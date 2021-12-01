package Numeros;

import java.text.NumberFormat;
import java.util.Locale;

public class aplicNumber {
    public static void main(String[] args) {
        double number1 = 1245.5;

        //formato BR
        NumberFormat nf1 = NumberFormat.getNumberInstance();
        String string1 = nf1.format(number1);
        System.out.println(string1);

        //formato USA
        NumberFormat nf2 = NumberFormat.getNumberInstance(new Locale("en","US"));
        String string2 = nf2.format(number1);
        System.out.println(string2);

        //formato moeda BR
        NumberFormat nf3 = NumberFormat.getCurrencyInstance();
        String string3 = nf3.format(number1);
        System.out.println(string3);

        //formato moeda USA
        NumberFormat nf4 = NumberFormat.getCurrencyInstance(new Locale("en","US"));
        String string4 = nf4.format(number1);
        System.out.println(string4);

    }
}
