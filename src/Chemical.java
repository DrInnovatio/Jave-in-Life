import java.io.PrintStream;
import java.io.PrintWriter;

class MyException extends Exception {

    public MyException(String s) {
        super(s);
    }

    @Override
    public String getMessage() {
        return "my message!! : " + super.getMessage();
    }

}

public class Chemical {

    public static void main(String[] args) {
        try {
            throw new MyException("Except the Test!!");
        }catch (MyException e){
            System.out.println("Message = " + e.getMessage());
        }
    }
}
