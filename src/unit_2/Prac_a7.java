package unit_2;
import java.io.*;

public class Prac_a7 {

    public static void main(String[] args) throws IOException {

        BufferedReader enter = new BufferedReader(new InputStreamReader(System.in));

        int[][] number = null;

        System.out.println("Rows? : ");
        int x = Integer.parseInt(enter.readLine());
        number = new int[x][];
        for(int i=0; i< number.length; i++){
            System.out.println(i + " Row : ");
            int y = Integer.parseInt(enter.readLine());
            number[i] = new int[y];

        }

        for(int i = 0; i < number.length; i++){
            for(int j=0; j < number[i].length; j++){
                System.out.println("Number[" + i + "][" + j + "] = ");
                number[i][j] = Integer.parseInt(enter.readLine());
            }
        }
        System.out.println();
        for(int i=0; i < number.length; i++){
            for(int j=0; j < number[i].length; j++){
                System.out.println("Number[" + i + "][" + j + "] = " + number[i][j]);
            }

        }

    }
}
