package unit_4;
import java.util.*;
import java.text.*;

class Swatch extends Thread{

    public void run(){
        while(true){
            SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            Date date = new Date();
            String str = format.format(date);
            System.out.println("The current time : " + str);

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

}

public class Clock {

    public static void main(String[] args) {
        System.out.println("Main started");
        Swatch watch = new Swatch();
        watch.setDaemon(true);
        watch.start();
        try {
            watch.join(5000);
             Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Main finished");
    }
}
