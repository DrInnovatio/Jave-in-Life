package unit_2;
import java.io.*;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Prac_a4 {

    public static void main(String[] args) throws IOException {

        BufferedReader enter = new BufferedReader(new InputStreamReader(System.in));

        int[] foo = new int[4];

        for(int i=0; i< foo.length; i++){
              foo[i] = Integer.parseInt(enter.readLine());
            System.out.println(foo[i]);
        }

    }
}
