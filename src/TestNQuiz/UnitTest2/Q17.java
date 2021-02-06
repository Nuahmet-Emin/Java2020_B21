package TestNQuiz.UnitTest2;

public class Q17 {
    public static void main(String[] args) {

        //Q17
        String str1 = "cybertek";
        //System.out.println(str1.length());
        // 0 2 4 6 8

        for(int i=0; i<=str1.length(); i+=2){
            System.out.print(str1.charAt(i)); //cbreException
        }



    }
}
