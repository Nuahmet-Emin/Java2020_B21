package TestNQuiz.UnitTest2;

public class Q14 {
    public static void main(String[] args) {

        int a=0;
        do{
            a= a++ + --a - (a % 3);
            System.out.println(a); // 0, 1 , 2, 6, 7

        }while(++a < 4);          // 1  2
        System.out.println(a);

        /*
        a = 3 + 3 - 0 = 6


         */
    }
}
