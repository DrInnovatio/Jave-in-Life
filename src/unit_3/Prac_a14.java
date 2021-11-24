package unit_3;

import java.io.*;

class Examine{
    private BufferedReader enter;
    private String name;
    private int age;

    public Examine(){
        enter = new BufferedReader((new InputStreamReader(System.in)));
        name = "";
        age = 0;
    }

    public void setName() throws IOException {
        System.out.println("What is your name?? : ");
        name = enter.readLine();
    }

    public void setAge() throws IOException{
        System.out.println("AGE : ??");
        age = Integer.parseInt(enter.readLine());
    }

    public void showing(){
        System.out.println("Mr " + name);
        System.out.println("You are " + age + " years old.");
    }
}


public class Prac_a14 {

    public static void main(String[] args) throws IOException {
        Examine good = new Examine();

        good.setName();
        good.setAge();
        good.showing();

    }

}
