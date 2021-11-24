package unit_3;

class Exam {

    protected int x = 100;
    private String name = "Jonathan";
    char y = 'A';

    public void show(){
        System.out.println(name);
    }
}

public class Prac_a13 {

    public static void main(String[] args) {
        Exam exam = new Exam();
        System.out.println(exam.x);
        System.out.println(exam.y);

        exam.show();
    }


}
