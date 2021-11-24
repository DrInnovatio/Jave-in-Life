package unit_3;

import java.lang.reflect.Array;
import java.util.Scanner;

public class LifeB {

    public static void main(String[] args) {
        /**
        Scanner scan = new Scanner(System.in);

        String[] names = new String[4];

        int range = names.length;

        for (int i = 0; i < range; i++){
            System.out.println("Enter the names : ");
            names[i] = scan.nextLine();
        }

        for(int i = 0; i < range; i++){
            System.out.println("Our customers : " + names[i]);
        }


        int[] numbers = {12, 3, 45, 2, 67, 61, 19, 99, 121, 11, 23};

        int max = numbers[0];

        for(int num : numbers){
            if(num > max){
                max = num;
            }
        }
        System.out.println(max);
         **/

        Scanner enter = new Scanner(System.in);
        String[] names = new String[4];

        int size = names.length;

        for(int i=0; i < size; i++){
            System.out.println("Enter the names : ");
            names[i] = enter.nextLine();
        }

        for(int i=0; i < size; i++){
            System.out.println("Our customers : " + names[i]);
        }
    }
}
