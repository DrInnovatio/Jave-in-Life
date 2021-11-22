package unit_1;

import java.io.*;

public class Prac_8 {

    public static void main(String[] args) throws IOException {
        /**
        while(true){
            System.out.println("Character : ");
            char ch = (char)System.in.read();
            System.out.println(ch + " = " + (int)ch);
            System.out.println("Keep going?? : (y/n)" );
            char c = (char)System.in.read();
            System.in.read();
            if(c == 'N' || c == 'n'){
                break;
            }

        }

        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        int korean = 0, english = 0, math = 0, total = 0;
        double average = 0.0d;

        do {
            System.out.println("Korean : ");
            korean = Integer.parseInt(in.readLine());
        } while(korean < 0 || korean > 100);

        do {
            System.out.println("English : ");
            english = Integer.parseInt(in.readLine());
        } while(english < 0 || english > 100);

        do {
            System.out.println("Math : ");
            math = Integer.parseInt(in.readLine());
        } while(math < 0 || math > 100);

        total = korean + english + math;
        average = total/3.0f;

        System.out.println("The Total Score is  " + total);
        System.out.println("The Average Score is  " + (Math.round(average * 100) / 100.0));

         **/

        BufferedReader enter = new BufferedReader(new InputStreamReader(System.in));
        int num1 = 0, num2 = 0, total = 0;
        char calculate = 0;

        System.out.println("Number 1 : ");
        num1 = Integer.parseInt(enter.readLine());

        do{
            System.out.println("Calculate : ");
            calculate = (char)System.in.read();
            System.in.read();
            System.in.read();
        } while (calculate != '+' && calculate != '-' && calculate != '*' && calculate != '/');

        do{
            System.out.println("Number 2 : ");
            num2 = Integer.parseInt(enter.readLine());
        }while(calculate == '/' && num2 == 0);

        switch (calculate){
            case '+':
                total = num1 + num2;
                break;

            case '-':
                total = num1 - num2;
                break;

            case '/':
                total = num1 / num2;
                break;

            case '*':
                total = num1 * num2;
                break;

            default:

        }
        System.out.println();
        System.out.println(num1 + " " + calculate + " " + num2 + " = " + total);

    }
}
