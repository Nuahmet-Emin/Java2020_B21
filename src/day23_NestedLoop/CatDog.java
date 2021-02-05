package day23_NestedLoop;
/*
check if the number of the cat in sentence is equal to number of the dog
            senstence = "dog dog Dog Dog cat CAT cAt CAt"
            output:
                true
 */
public class CatDog {
    public static void main(String[] args) {

        String senstence = "dog dog Dog Dog cat CAT cAt CAt";

        String temp = senstence.toLowerCase();

        int countDog = 0;
        String word = "dog";
        while(temp.contains(word)){
              temp = temp.replaceFirst(word,"");
              countDog ++;
        }


        int countCat = 0;
        word = "cat";
        while(temp.contains(word)){
            temp = temp.replaceFirst(word,"");
            countCat ++;
        }
        System.out.println("Number of cats: " +countDog);
        System.out.println("Number of dogs: " +countCat);

        System.out.println(countDog == countCat);

    }
}
