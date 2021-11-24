package unit_3;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class LifeA {

    public static void main(String[] args) {
        try {
            File file = new File("out.txt");
            Scanner scan = new Scanner(file);

            while (scan.hasNextInt()) {
                System.out.println(scan.nextInt() * 1000);
            }
            scan.close();
        } catch (FileNotFoundException e){
            e.printStackTrace();
        }
    }
}
