package unit_4;

class Kay extends Thread {

    private int x = 100;

    public void setX(int x){
        this.x += x;
    }
    public synchronized int getX(){
        return x;
    }
    public void run(){
        synchronized (this) {
            setX(200);
            System.out.println("x = " + getX());
        }
    }
}
public class Hooper {

    public static void main(String[] args) {
        Kay newKay = new Kay();
        newKay.start();
       // newKay.start();

    }
}
