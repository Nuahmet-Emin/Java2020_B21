package day07_UnaryOperators;

public class EvenlyDivisible {
    public static void main(String[] args) {

        int number = 100;
        int remainderOf2 = number % 2 ;
        boolean divisibleBy2 = remainderOf2 < 1;

        int remainderOf3 = number % 3;
        boolean divisibleBy3 = remainderOf3 < 1;

        int remainderOf5 = number % 5;
        boolean divisibleBy5 = remainderOf5 < 1;

        System.out.println(number + " is divisible by 2: " + divisibleBy2);
        System.out.println(number + " is divisible by 3: " + divisibleBy3);
        System.out.println(number + " is divisible by 5: " + divisibleBy5);


        


    }
}
