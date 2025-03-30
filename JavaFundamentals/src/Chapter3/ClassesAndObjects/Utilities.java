package Chapter3.ClassesAndObjects;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Utilities {

    public static String getCurrentYear(){
        Date date = new Date();
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy");
        return dateFormat.format(date);
    }
}
