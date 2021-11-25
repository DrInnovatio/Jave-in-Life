package unit_4.partB;

import java.io.*;

public class MyCircle extends MyPoint{

    private int r;
    public void input() throws IOException{
        System.out.print("x = ");
        x = Integer.parseInt(enter.readLine());
        System.out.print("y = ");
        y = Integer.parseInt(enter.readLine());
        System.out.print("r = ");
        r = Integer.parseInt(enter.readLine());
    }

    @Override
    public void output() {
        System.out.println(x + " , " + y + " , " + r);
    }


}
