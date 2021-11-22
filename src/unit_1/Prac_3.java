package unit_1;

import java.io.*;

public class Prac_3 {

    public static void main(String[] args) throws IOException {

        // Switch Statement

        //int num = 0;
        char num = 0;

        System.out.println("Number is : ");
        //num = System.in.read() - 48;
        num = (char)System.in.read();

        switch (num){
            case '0':
                System.out.println("You are from Seoul.");
                break;

            case '1':
                System.out.println("You are from KyounggiDo");
                break;

            case '9':
                System.out.println("You are from JeJu Island.");
                break;

            default:
                System.out.println("Enter the number again.");

        }
    }
}
