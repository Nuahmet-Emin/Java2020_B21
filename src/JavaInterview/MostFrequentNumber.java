package JavaInterview;

public class MostFrequentNumber {

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,3,3,2,};
        System.out.println(mostFrequentNum(arr));
    }

    public static int mostFrequentNum(int[] arr){
        int maxFreq = 0;
        int result = 0;
        for (int eachNum : arr) {
            int count = 0;
            for (int each : arr) {
                if(each == eachNum){
                    count++;
                }
            }
            if (count >= maxFreq) {
                maxFreq = count;
                result =  eachNum;
            }

        }
        return result;
    }
}
