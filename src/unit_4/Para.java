package unit_4;

// dealing with the exception



public class Para {

    public static void queen(){
        try{
            System.out.println("What are they doing??");
            int total = 10 / 0 ;
            System.out.println("Total = " + total);

        } catch (ArithmeticException e){
            System.out.println("Number cannot be divided by zero!!");
        }
        finally{
            System.out.println("Queen done!!");
        }
    }

    public static void main(String[] args) {
        queen();
    }
}
