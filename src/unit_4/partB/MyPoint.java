package unit_4.partB;

import java.io.*;

public abstract class MyPoint {

    protected static BufferedReader enter;

    static {
        enter = new BufferedReader(new InputStreamReader(System.in));
    }

    protected int x;
    protected int y;

    public abstract void input() throws IOException;
    public abstract void  output();

}
