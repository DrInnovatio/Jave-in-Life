package Amazon;

import java.util.*;

class Cake {

}

class Noodle {

}

public class Puma {

    public static void main(String[] args) {

        Cake mimi = new Cake();
        Noodle ramen = new Noodle();
        String foo = new String("barbarbarbar");

        Hashtable joojoo = new Hashtable();

        joojoo.put("one", mimi);
        joojoo.put("two", ramen);
        joojoo.put("three", foo);

        /**
        Enumeration enu = joojoo.elements();
        while(enu.hasMoreElements()){
            Object obj = enu.nextElement();
            System.out.println("Obj = " + obj);
        }
         **/

        Enumeration enu = joojoo.keys();
        while (enu.hasMoreElements()){
            String name = (String)enu.nextElement();
            Object obj = joojoo.get(name);
            System.out.println(name + " ==> " + obj);
        }
    }
}
