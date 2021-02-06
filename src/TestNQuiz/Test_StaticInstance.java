package TestNQuiz;

public class Test_StaticInstance {
    static int a = 10;
    int b = 10;

    static String name = "john";
    String id = "123";

    int score;

    /*
    static{
        score = 75;
    }

     */

    static String studentName = "Mike";
    static {
        studentName = "Jordan";
    }

    public static void main(String[] args) {
        Test_StaticInstance obj1 = new Test_StaticInstance();
        //obj1.b = 10;
        obj1.a = 20;

        Test_StaticInstance obj2 = new Test_StaticInstance();
        obj2.b = 30;
        //obj2.a = 40;

        System.out.println(obj1.a + " " + obj1.b);
        System.out.println(obj2.a + " " + obj2.b);

       // System.out.println(name);
        //System.out.println(id + 1);

        studentName = "Jean";
        System.out.println(studentName);

    }
}
