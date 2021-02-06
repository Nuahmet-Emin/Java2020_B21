package JavaInterview;

public class OddEven {

    public static void main(String[] args) {
        int number = 5;
        System.out.println(OddEven(number));
    }
    public static String OddEven(int number){
        if(number % 2 == 0 ){
            return "Even";
        }
        else{
            return "Odd";
        }
    }
}
/*
Write  a method which can identifies given number is even or odd
 */