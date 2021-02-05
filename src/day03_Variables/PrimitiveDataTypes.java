package day03_Variables;

public class PrimitiveDataTypes {
    public static void main(String[] args) {

        //int score = 85;
        //long score = 85; // 85
        //float score = 85; // 85.0
        double score = 85; // 85.0


        System.out.println(score);

        //long number0 = 9999999999; // int is preferred, compiler takes it as an int
                                    // and the number 9999999999 is out of int's range

        long number1 = 9999999999l;

        double decimal1 = 0.5;
        //float flot1= 0.5; // double is preferred for decimals, compiler takes it as double
        // double's range is greater than float
        float float2 = 0.5f;

        System.out.println(float2);




    }
}
