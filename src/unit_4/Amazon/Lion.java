package Amazon;

import java.util.*;

class Candy {

}

class Bisket {

}

public class Lion {

    public static void main(String[] args) {
        Candy a = new Candy();
        Bisket b = new Bisket();
        String c = new String("google");

        Vector vec = new Vector();
        ArrayList arr = new ArrayList();

        vec.add(a);
        vec.add(b);
        vec.add(c);

        arr.add(a);
        arr.add(b);
        arr.add(c);

        for(int i=0; i < vec.size(); i++){
            Object obj = vec.elementAt(i);
            System.out.println(i + " ==> " + obj);
        }
        for(int i=0; i < arr.size(); i++){
            Object obj = arr.get(i);
            System.out.println(i + " ==> " + obj);
        }
    }

}
