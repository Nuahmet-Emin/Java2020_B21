package TestNQuiz.UnitTest2;

public class Q13 {
    public static void main(String[] args) {

        int number = 5;
        while(number <100){
            number += number;
            System.out.println(number);
            /*


            10
            20
            40
            80
             */
        }
        System.out.println(number);



        //Q14



        //Q15
        String str = "The whole time it was raining.";
        do{
            System.out.print(str.charAt(0) );
            str = str.substring(3);
        }while(!str.isEmpty());

        //Q.16
        String s = "I will";
        String word = "";

        for(int index = s.length()-1; index<=0; index--){
            word += s.charAt(index);
        }
        System.out.println(word);




    }
}
