package Amazon;

import java.util.*;

class Dog {

}

class Tiger {

}
public class Anaconda {

    public static void main(String[] args) {

        Dog puppy =  new Dog();
        Tiger ty = new Tiger();

        String ccc = new String("CC");
        HashSet hs = new HashSet();

        hs.add(puppy);
        hs.add(ty);
        hs.add(ccc);

        Iterator it = hs.iterator();

        while (it.hasNext()){
            Object obj = it.next();
            System.out.println("Object is : " + obj);
        }



     }

}
