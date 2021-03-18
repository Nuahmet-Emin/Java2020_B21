package JavaInterview;

public class IsPrime {

    public static void main(String[] args) {
        int n =7;
        System.out.println(isPrime(n));

        int[] arr = {1,3,4};
        int sum = 0;
        for(int each: arr){
            for(int i= 2; i< each; i++){
                if(each % i != 0){
                    sum += each;
                }
            }
        }
        System.out.println(sum);

    }


    public static boolean isPrime(int n){
        if(n<2) return false;
        for(int i = 2; i<n;i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

}

