package day53_Collection;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class QuePractice {
    public static void main(String[] args) {

        Queue<Integer> arrayDeque = new ArrayDeque<>();
        arrayDeque.addAll(Arrays.asList(10,12,9,8,11,5,4,7,6,3));

        System.out.println("arrayDeque" +arrayDeque);
        arrayDeque.poll(); //10
        arrayDeque.poll(); //12
        System.out.println("arrayDeque" +arrayDeque);

        System.out.println( ((ArrayDeque) arrayDeque).getFirst() );

        System.out.println( ((ArrayDeque) arrayDeque).getLast() );



        System.out.println("===============================");

        Queue<Integer> linkedList = new LinkedList<>();
        linkedList.addAll(Arrays.asList(10,12,9,8,11,5,4,7,6,3));

        System.out.println(linkedList  );
        linkedList.poll();

        System.out.println(linkedList  );

        System.out.println(linkedList);
        System.out.println("===============================");

        System.out.println();


    }
}
