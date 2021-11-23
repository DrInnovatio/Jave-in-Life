package unit_2;
import java.io.*;

public class Baseball {

    public static void main(String[] args) throws IOException{

        BufferedReader enter = new BufferedReader(new InputStreamReader(System.in));

        int[] computer = new int[3];

        boolean bool = false;

        for(int i=0; i<computer.length; i++){
            do{
                bool = false;
                computer[i] = (int)(Math.random() * 10);
                for(int j=0; j<i; j++) {
                    if(computer[i] == computer[j]) bool = true;
                }
            }while(bool);
            System.out.print(computer[i] + " \t");
        }
        System.out.println();

        int[] myself = new int[3];
        int count = 0;

        while(true){
            int strike = 0, ball = 0;
            System.out.println("Enter three numbers : ");

            for(int i=0; i< myself.length; i++){
                myself[i] = System.in.read() - 48;
            }
            System.out.println();
            System.out.println();

            for(int i=0; i< myself.length; i++){
                for(int j=0; j<computer.length; j++){
                    if(myself[i] == computer[j]){
                        if(i == j) strike++;
                        else ball++;
                    }
                }
            }
            System.out.println(strike + " strike " + ball + " ball");
            count ++;
            if(strike == 3) break;
        }
        System.out.println("You took " + count + " times to win this match.");
    }
}
