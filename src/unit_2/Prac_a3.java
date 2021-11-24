package unit_2;

import java.io.*;

public class Prac_a3 {

    public static void main(String[] args) throws IOException {

        BufferedReader enter = new BufferedReader(new InputStreamReader(System.in));
        String[]name = new String[3];

        for(int i=0; i< name.length; i++){
            System.out.println(i + " human : ");
            name[i] = enter.readLine();
        }
        for(int i=0; i< name.length; i++){
            System.out.println(i + "th" + "  " +  name[i]);
            name[i] = enter.readLine();
        }
        for(int i=0; i < name.length; i++ ){
            System.out.println("Customer names : " + name[i]);
        }
    }
}

