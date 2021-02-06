package TestNQuiz.UnitTest2;

public class Q29 {
    public static void main(String[] args) {

        int[] nums = {14, 1, 84,97,1243, 46}; // len =6
        int total =0; //

        for(int i=0; i< nums.length ; i++){
            if(nums[i] % 2 !=0){
                total +=3;
            }else{
                total +=10;
            }

            if(i % 3 ==0){
                total -=15;
            }
        }

        System.out.println(total);

        System.out.println("=================================");

        //Q30

        String [] things = {"house", "shed","slide","zebra","park","garden"};

        for(String s: things){
            switch (s.charAt(1)){
                case'h':
                    System.out.println(1);
                    break;

                case'a':
                    System.out.println(2);
                case's':
                    System.out.println(3);
                    break;

                case'o':
                default:
                    System.out.println(4);
                case'p':
                    System.out.println(5);
                    break;

                case'z':
                    System.out.println(6);
                case'l':
                    break;
                case'g':
                    System.out.println(7);
            }
        }

        System.out.println("===============");
        System.out.println(1 % 3);
    }
}
