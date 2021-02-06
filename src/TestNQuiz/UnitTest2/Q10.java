package TestNQuiz.UnitTest2;

public class Q10 {
    public static void main(String[] args) {

    String a = "today I will go to the beach";
    boolean b = a.contains("i");
    boolean c = a.substring(12).startsWith("go");

        System.out.println(b && c);

        //Q12.

        for(int i=0; i<10; i++){
            if(i%2 ==0){
                continue;
            }
            System.out.print(i);
        }


    }
}
