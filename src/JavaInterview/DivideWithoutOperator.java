package JavaInterview;

public class DivideWithoutOperator {

    public static void main(String[] args) {

        divides(9,4);
    }

    public static void divides(int num1 , int num2){ // 9 4 : 9-4 = 5 -4 = 1
        if(num2 == 0){
            System.out.println("Invalid number");
            System.out.println(num1 + " divided by " + num2 + " is: ");
            return;
        }

        int count = 0;
        while (num1 >= num2){ // 9, 4
            num1 -= num2;
            /*
            9 - 4 = 5;
            5 - 4 = 1
            1 <= 4
             */
            count++;
        }
        System.out.println(count + " with remainder " + num1);
    }

}
