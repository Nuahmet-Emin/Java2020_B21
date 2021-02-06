package TestNQuiz.UnitTest2;

public class Q19 {
    public static void main(String[] args) {

        //Q.19
        int total =0;
        for(int j=0; j<5; j++){
            //System.out.println(j);
            if(j % 3 ==0) continue;
            total += 2 + 6; // executed while j = 1,2,4
           // System.out.println(total);

        }
        System.out.println(total);

    }
}
