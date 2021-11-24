package unit_3;

class Outter {

    private int x = 0;
    private static int y = 200;
    public Outter(){

    }
    public void display(){
        System.out.println("x = : " + x);
        System.out.println("y = : " + y);
    }

    class Inner {

        private int a = 100;
        public Inner(){

        }
        public void displaying(){
            System.out.println("a = : " + a);
            System.out.println("x = : " + x);
            System.out.println("y = : " + y);
            display();
        }

        class Another {

        }
    }

}

public class Community {

    public static void main(String[] args) {

        Outter out = new Outter();

        Outter.Inner in = out.new Inner();
        in.displaying();
        Outter.Inner.Another hoop = in.new Another();

        System.out.println("=======");

        Outter out1 = new Outter();
        Outter.Inner in1 = out1.new Inner();
        Outter.Inner in2 = out1.new Inner();

        in1.displaying();
        in2.displaying();


















    }
}
