package day46_JavaRecap;

public class MorningWorkOut {

    public static void main(String[] args) {

        for(int i=1 ; i<=30; i++){
            System.out.println("Push up " + i);
            sleep(1.5);
        }

        System.out.println("================================");
        for(int i=1; i<= 20; i++){
            System.out.println("Pull up: " + i);
            sleep(2.5);
        }
    }

    public static void sleep(double seconds)  { // 2.5
                          // (long)(2500.0)
        try{
            Thread.sleep((long)(seconds * 1000));
        }catch (InterruptedException e ){

        }

    }


}
/*
1. Do 30 push ups
      try pass 1.5 second in each

 2. Do 20 pull ups
 try pass 2.5 sec in each
 */