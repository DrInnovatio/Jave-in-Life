package unit_1;

import java.io.*;

public class Prac_4 {

    public static void main(String[] args) throws IOException {
        int num = 0;
        int year = 0;
        String str = "";


        System.out.println("주민번호 7번째 자리 : ");
        num = System.in.read() - 48;

        switch (num){

            case 9:
            case 0:
                year = 1800;
                break;

            case 1:
            case 2:
                year = 1900;
                break;

            case 3:
            case 4:
                year = 2000;
                break;
            default:
                year = -1;
        }

        switch (num % 2){
            case 0:
                str = "woman";
                break;

            case 1:
                str = "man";
                break;
        }
        if(year == -1){
            System.out.println("Wrong number !!");
        } else {
            System.out.println("You were born in " + year + " and " + str);
        }


    }


}
