package unit_1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Prac_2 {

    public static void main(String[] args) throws IOException {

        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int su1 = 0, su2 = 0, su3 = 0;

        System.out.println("number 1 = ");
        su1 = Integer.parseInt(in.readLine());
        System.out.println("number 2 = ");
        su2 = Integer.parseInt(in.readLine());
        System.out.println("number 3 = ");
        su3 = Integer.parseInt(in.readLine());

        if(su2 >= su1 && su2 >= su3){
            int temp = su1;
            su1 = su2;
            su2 = temp;
        } else if(su3 >= su1 && su3 >= su2) {
            int temp = su1;
            su1 = su3;
            su3 = temp;
        }
        if(su3 > su2){
            int temp = su2;
            su2 = su3;
            su3 = temp;
        }

        System.out.println(su1 + ">=" + su2 + ">=" + su3);

    }
}
