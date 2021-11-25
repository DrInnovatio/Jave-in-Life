package unit_4.partA;

abstract class Apple{

    public abstract void seed();

}

class Banana extends Apple{

    @Override
    public void seed() {
        System.out.println("I like apple better than Banana.");
    }
}

class Orange extends Apple{
    @Override
    public void seed() {
        System.out.println("I prefer to buy a box of Orange than the apple.");
    }
}


public class AbstractLecSecond {

    public static void main(String[] args) {

        Banana banana = new Banana();
        Orange orange = new Orange();

        banana.seed();
        orange.seed();



    }
}
