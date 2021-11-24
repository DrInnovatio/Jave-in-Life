package unit_3;

class Koolman{

    private int x;
    private int y;

    public Koolman(){
         this.x = 333;
         this.y = 555;
    }

    public Koolman(int x){
        this.x = x;
        this.y = 444;
    }

    public Koolman(int x, int y){
        this.x = x;
        this.y = y;
    }

    public void setXY(int a, int b){
        this.x = a;
        this.y = b;
        this.display();
    }

    public void display(){
        System.out.println(x);
        System.out.println(y);
    }
}


public class Prac_a15 {

    public static void main(String[] args) {
        Koolman kool = new Koolman();
        kool.display();
        System.out.println("==== ");
        kool.setXY(234, 875);
        kool.display();

        Koolman pool1 = new Koolman();
        Koolman pool2 = new Koolman(10);
        Koolman pool3 = new Koolman(1902, 2130);

        System.out.println(pool1);
        System.out.println(pool2);
        System.out.println(pool3);
    }


}
