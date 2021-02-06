package TestNQuiz.UnitTest4;

public class Q8 {
    int count;

    public void m(){
        count++;
    }

    public void m(int n ){
        count *= n;
    }

    public static void main(String[] args) {
        Q8 obj = new Q8();
        obj.m(5);
        obj.m();
        obj.count += 10;
        obj.m(2);
        System.out.println(obj.count);
    }
}
