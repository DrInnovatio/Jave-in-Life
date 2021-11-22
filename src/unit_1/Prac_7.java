package unit_1;

public class Prac_7 {

    public static void main(String[] args) {
        aaa:for(int j=0; j<5; j++){
            bbb:for(int i=0; i<5; i++){
            if(i==2) continue aaa;
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
