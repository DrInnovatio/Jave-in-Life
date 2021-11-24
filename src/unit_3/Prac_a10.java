package unit_3;

class Student {
    String name = "James";
    int korean = 88;
    int english = 98;
    int math = 81;

    void goo(){
        System.out.println(name + " " + korean + " " + english + " " + math);
    }
}

class Numbers {
    double a = 43.2345d;
    double b = 324.1243124d;
    double c = 908.2315235d;
}

public class Prac_a10 {

    public static void main(String[] args) {

        Student person = new Student();
        person.name = "James";
        person.english = 77;
        System.out.println(person.name);
        System.out.println(person.english);
        System.out.println(person.math);
        person.goo();

        Numbers num = new Numbers();
        System.out.println(num.a);
        System.out.println(num.b);
        System.out.println(num.c);

        int foo = person.english;
        int voo = person.math;

        double joo = num.a;
        double noo = num.b;

        System.out.println(foo + " : " + joo);
        System.out.println(voo + " : " + noo);


    }

}
