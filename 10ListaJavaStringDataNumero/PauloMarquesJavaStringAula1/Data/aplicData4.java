package Data;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class aplicData4 {
    public static void main(String[] args) {
        String stringData1 = "01-08-2030";
        SimpleDateFormat df1 = new SimpleDateFormat("dd-MM-yyyy");
        try {
            Date data1 = df1.parse(stringData1);
            System.out.println(data1);
        }catch (ParseException e){
            e.printStackTrace();
        }

        String stringData2 = "16101996";
        SimpleDateFormat df2 = new SimpleDateFormat("ddMMyyyy");
        try{
            Date data2 = df2.parse(stringData2);
            System.out.println(data2);
        }catch (ParseException e){
            e.printStackTrace();
        }
    }
}
