package unit_4.partB;
import java.io.*;
public class Play {

    public static void main(String[] args) throws IOException {

        BufferedReader enter = new BufferedReader(new InputStreamReader(System.in));

        MyPoint[] mp =  new MyPoint[10];

        for (int i = 0; i < mp.length; i++ ){
            System.out.println("1. Circle 2.Rectangle 3. Check the list  4.Quit"  ) ;
            int x = Integer.parseInt(enter.readLine());

            if(x == 1){
                mp[i] = new MyCircle();
                mp[i].input();
            }
            else if(x == 2){
                mp[i] = new MyRect();
                mp[i].input();
            }
            else if(x == 3){
                for(int j=0; j < i; j++) {
                    mp[j].output();
                }
                i--;
            }
            else if(x == 4){
                System.exit(0);
            } else {
                System.out.println("Wrong number !");
                i--;
            }
            System.out.println("======");



        }
    }

}
