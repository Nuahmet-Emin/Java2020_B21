package day23_NestedLoop;

public class NestedLoopPractice {
    public static void main(String[] args) {

        for(int i=1; i<=8; i++){
            System.out.print("\t"); // insert tab before printing
            for(int j=1; j<= i; j++){
                System.out.print("*");
            }
            System.out.println();
        }


        for(int j=8; j>=1; j--){
            System.out.print("\t");

            for(int i=j; i>=1; i--){
                System.out.print("*");
            }
            System.out.println();
        }



    }
}
