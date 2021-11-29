package Amazon;

public class Kangaroo {

    public static void main(String[] args) {

        Boolean bool1 = new Boolean(false);
        Boolean bool2 = new Boolean("true");
        Boolean bool3 = Boolean.FALSE;
        Boolean bool4 = Boolean.valueOf(false);
        Boolean bool5 = Boolean.valueOf("true");

        System.out.println("Bool 2 = " + bool5.booleanValue());

        System.out.println(Byte.MIN_VALUE + " -- " + Byte.MAX_VALUE);

        try{
            Class css = Class.forName("Amazon.Lion");
        } catch (ClassNotFoundException e) {
            System.out.println("cannot find it.");
        }

        System.out.println((int)(Math.random() * 11));

        int[] numbers = new int[50];

        int count = 0;
        int sum = 0;


        for(int i=0; i < 50; i++){
            int random = (int)(Math.random() * 10);
            numbers[i] += random;
            i++;
        }
        for(int i=0; i < 50; i++){
            System.out.println(numbers[i]);

            if(numbers[i] == 0){
                ++count;
                sum += count;
                System.out.println("Zero = " + sum);
            }
        }






    }
}
