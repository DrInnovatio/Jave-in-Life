package unit_1;

import java.io.*;

public class Prac_11 {
    public static String getString(String str) throws IOException{
        BufferedReader enter = new BufferedReader(new InputStreamReader(System.in));
        System.out.println(str + " - ");
        return enter.readLine();
    }

    public static int getInt(String str) throws IOException{
        BufferedReader enter = new BufferedReader(new InputStreamReader(System.in));
        System.out.println(str + " - ");
        return Integer.parseInt(enter.readLine());
    }

    public static void main(String[] args) throws IOException{
        String name = getString("Your name : ");
        int age = getInt("Your age : ");

        System.out.println("You are " + name + " and " + age + " years old.");
    }
}

// test it under my name.
// the third test