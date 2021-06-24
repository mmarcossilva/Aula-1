package aula1.pt2;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Ex2 {
    public static void main(String[] args) {
        Date date = new Date();
        SimpleDateFormat fmt = new SimpleDateFormat("dd/MM/yyyy");

        Calendar c = Calendar.getInstance();
        c.setTime(date);


        double valueX = 1.13;
        double valueY = 18.4;
        while (valueX < valueY) {
            System.out.println("Empresa X  - " + fmt.format(c.getTime()) + " - Valor da empresa - " + valueX + "m");
            System.out.println("Empresa Y  - " + fmt.format(c.getTime()) + " - Valor da empresa - " + valueY + "m");
            c.add(Calendar.YEAR, 1);
            valueX *= 2.48;
            valueY *= 1.32;
        }
    }
}
