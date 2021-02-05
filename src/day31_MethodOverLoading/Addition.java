package day31_MethodOverLoading;

public class Addition {
    public static void main(String[] args) {
        System.out.println( additionOf2Numbers(1,2));
        System.out.println(additionOf3Numbers(1,3,5));
        System.out.println(additionOf4Numbers(1,2,3,4));


    }

    public static int additionOf2Numbers(int num1,int num2){
        //int sum = num1 + num2;
         return num1 + num2;
       // return sum;
    }

    public static int additionOf3Numbers(int num1, int num2, int num3){
        int sum = num1 +num2+num3;
        return sum;
    }
    public static int additionOf4Numbers(int num1, int num2, int num3,int num4){
        return num1+ num2+num3+num4;
    }

}
