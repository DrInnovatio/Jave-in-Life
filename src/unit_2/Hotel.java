package unit_2;
import java.io.*;


public class Hotel {
    public static void main(String[] args) throws IOException {

        BufferedReader enter = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("How many rooms are there?");
        int num = Integer.parseInt(enter.readLine());
        String[] name = new String[num];

        while(true){
            System.out.println("1. Check In | 2. Check Out | 3. Find the List | 4. Quit");
            int x = System.in.read() - 48;
            System.out.println();
            System.out.println();

            if(x == 1){
                System.out.println("Which room do you want to stay?");
                int a = 0;
                do{
                    a = Integer.parseInt(enter.readLine());
                } while(a<0 || a >= num );

                System.out.println("The customer's name : ");
                name[a] = enter.readLine();

            }
            else if(x == 2){
                int a = 0;
                do{
                    System.out.println("Which room have you stayed? ");
                    a = Integer.parseInt(enter.readLine());
                }while(a<0 || a >=num || name[a] == null);
                name[a] = null;
            }
            else if(x == 3){
                for(int i = 0; i < name.length; i++){
                    System.out.print(i + " room customer : " + name[i]);
                    if(i % 3 == 2) System.out.println();
                    else System.out.print("\t");
                }
            }
            else if(x == 4){
                break;
            }
            else {
                System.out.println("That was a wrong number.");
            }
        }
        System.out.println("The system finished.");
    }
}
