package unit_3;

class Finance {

    private String name;
    private double money;
    private static float interest;

    public Finance(String name, double money, float interest) {
        this.name = name;
        this.money = money;
        this.interest = interest;
    }

    public static void setInterest(float interest){
        Finance.interest = interest;
    }

    public void display(){
        System.out.println("Name : " + name);
        System.out.println("Money : " + money);
        System.out.println("Interest : " + interest);
    }
}

public class TheBank {

    public static void main(String[] args) {

        Finance customer1 = new Finance("James", 1000.43, 0.7f);
        customer1.display();
        System.out.println("====");
        Finance customer2 = new Finance("Jane", 2134.98, 0.3f);
        customer1.display();
        customer2.display();
        System.out.println("====");
        Finance customer3 = new Finance("Jane", 2134.98, 1.23f);
        customer1.display();
        customer2.display();
        customer3.display();

    }
}
