package test;

import djkstra.Graph;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class MainClass {
    public static void main(String[] args) throws ParseException {

        SimpleDateFormat formatYYYY_MM_DD_TIME = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date date = null;
        try {
            date = formatYYYY_MM_DD_TIME.parse("2015-01-08 00:00:00.0");
            System.out.println(date.toString());
        }catch (Exception e){
            System.out.println("Exception");
        }

    }
}
