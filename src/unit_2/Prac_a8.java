package unit_2;
import java.util.Arrays;

public class Prac_a8 {
    public static String[] getAnimals(){
        String[] animals = {"Tiger", "Dog", "Cat", "Horse", "Rabbit", "Rooster"};
        return animals;
    }

    public static void main(String[] args) {
        String[] animals = getAnimals();
        String x = animals[2];
        String y = animals[4];
        System.out.println(Arrays.toString(animals));
        System.out.println(x);
        System.out.println(y);
    }
}
