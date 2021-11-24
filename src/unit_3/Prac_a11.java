package unit_3;

class People{

    public int age;
    public String name;
    public boolean isMarried;
    public int children;

    public void info(){
        System.out.println("AGE : " + age);
        System.out.println("NAME : " + name);
        System.out.println("Marital Statement : " + isMarried);
        System.out.println("Number of chldren : " + children);
    }
}

public class Prac_a11 {

    public static void main(String[] args) {

        People person = new People();

        person.age = 44;
        person.name = "John";
        person.isMarried = true;
        person.children = 3;

        person.info();



        }






}
