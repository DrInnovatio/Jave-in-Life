package unit_2;
import java.io.*;


public class Prac_a5 {

    public static void main(String[] args) throws IOException {

        if(args.length != 1){
            System.out.println("Usage : the number of people : ");
            System.exit(0);
        }

        int numPeople = Integer.parseInt(args[0]);
        BufferedReader enter = new BufferedReader(new InputStreamReader(System.in));
        String[] name = new String[numPeople];

        int[] korean = new int[numPeople];
        int[] english = new int[numPeople];
        int[] math = new int[numPeople];
        int[] total = new int[numPeople];
        float[] average = new float[numPeople];
        int[] rank = new int[numPeople];

        for(int i=0; i<numPeople; i++) {
            System.out.println(i + " name : ");
            name[i] = enter.readLine();
            System.out.println(i + " korean : ");
            korean[i] = Integer.parseInt(enter.readLine());
            System.out.println(i + " english : ");
            english[i] = Integer.parseInt(enter.readLine());
            System.out.println(i + " math : ");
            math[i] = Integer.parseInt(enter.readLine());

            total[i] = korean[i] + english[i] + math[i];
            average[i] = total[i] / 3.0f;
        }
            for(int i=0; i<numPeople; i++){
                for(int j=0; j<numPeople; j++){
                    if(total[i] < total[i]){
                        rank[i]++;
                    }
                }
            }

            for(int i=0; i <numPeople; i++){
                for(int j=0; j<numPeople; j++){
                    if(total[i] < total[j]) rank[i]++;
                }
            }

        System.out.println();

            for(int i=0; i<numPeople; i++){
                System.out.println(name[i] + "\t");
                System.out.println(korean[i] + "\t");
                System.out.println(english[i] + "\t");
                System.out.println(math[i] + "\t");
                System.out.println(total[i] + "\t");
                System.out.print(".2f" + average[i] + "\t");
                System.out.println(rank[i] + "\t");
            }


    }

}
