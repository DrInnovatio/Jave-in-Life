package unit_2;

public class Prac_a1 {

    public static void numbering(){
        int i = 0;
        while (i < 10){
            System.out.print(i + " ");
            i++;
        }
    }

    public static  void stars(){
        for(int i=0; i<10; i++){
            for(int j=0; j<i; j++){
                System.out.print("*");
            }
        System.out.println();
        }
    }

    public  static void hello(){
        System.out.println("hello world");
    }

    public static void main(String[] args) {
        numbering();
        stars();
        hello();
    }
}
