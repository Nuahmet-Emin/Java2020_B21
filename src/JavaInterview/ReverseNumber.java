package JavaInterview;

public class ReverseNumber {
    public static void main(String[] args) {

        int num = 123;
        System.out.println("reverseNum(num) = " + reverseNum(num));


    }
    public static int reverseNum(int num){
        //int num = 123
        int reverse =0;

        while(num!=0){
            int digit = num % 10;
            reverse = reverse * 10 + digit ; // 3, 32 , 321

            num /= 10;
        }


        return  reverse;
    }
}
