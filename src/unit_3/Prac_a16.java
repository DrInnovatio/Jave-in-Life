package unit_3;

class OutterSecond{

    private int x = 100;
    private static int y = 200;

    public void display(){
        class Inner2{
            private int a = 10;
            // private static int b = 20;
            public void displaying(){
                System.out.println(a);
                System.out.println(x);
                System.out.println(y);
            }

        }
        Inner2 in = new Inner2();
        in.displaying();
    }
}

public class Prac_a16 {

    public static void main(String[] args) {
        OutterSecond out = new OutterSecond();
        out.display();
    }



}
