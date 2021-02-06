package WarmpUps.day38;

public class PizzaObject {
    public static void main(String[] args) {
        Pizza order1 = new Pizza();
        order1.customizeOrder("small",2,1,5);
        System.out.println(order1);

        Pizza order2= new Pizza();
        order2.customizeOrder("Large",0,1,10);
        System.out.println(order2);

    }

}
