package unit_1;

import java.io.*;
import java.nio.Buffer;

public class Prac_10 {

    public static int plus(int num1, int num2){
        return num1 + num2;
    }

    public static int minus(int num1, int num2){
        return num1 - num2;
    }

    public static int multiple(int num1, int num2){
        return num1 * num2;
    }

    public static int divide(int num1, int num2){
        int temp = 0;
        if(num2 == 0){
            num2 = 1;
        }
        return num1 / num2;
    }

    public static void main(String[] args) throws IOException {

        BufferedReader enter = new BufferedReader(new InputStreamReader(System.in));
        int num1 = 0, num2 = 0;
        int total = 0;
        char cal = 0;

        System.out.println("Num1 : ");
        num1 = Integer.parseInt(enter.readLine());

        System.out.println("Num2 : ");
        num2 = Integer.parseInt(enter.readLine());

        do{
            System.out.println("Cal : ");
            cal = (char)System.in.read();
            enter.readLine();
        }while(cal != '+' && cal != '-' && cal != '*' && cal != '/' );

        switch(cal){

            case '+':
                total = plus(num1, num2);
                break;

            case '-':
                total = minus(num1, num2);
                break;

            case '*':
                total = multiple(num1, num2);
                break;

            case '/':
                total = divide(num1, num2);
                break;
        }
        System.out.println("Total = " + total);

    }
}
