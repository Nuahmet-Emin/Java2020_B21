package TestNQuiz.UnitTest2;

public class Q3 {
    public static void main(String[] args) {

        String word = "   Winter is coming     ";
        word = word.trim();
        System.out.println(word.length());


        //Q4.
        String a = "123";
        String b = 5+4+a;
        System.out.println(b);

        //Q5. a
        String s= "Java is fun";
        int c = s.charAt(4);

        if(c== ' '){
            System.out.println("B");
        }





        //Q7.
        String fox = "the fox ran under the bridge";
        fox = fox.substring(4,17);
        fox.toUpperCase();

        System.out.println(fox + "ground");
    }
}
