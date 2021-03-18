package day49_Abstraction.ShapeTask;

public class main {

    public static void main(String[] args) {

//        PriorityQueue toDo = new PriorityQueue();
//        toDo.add("dishes");
//        toDo.add("laundry");
//        toDo.add("bills");
//        toDo.offer("bills");//The offer(E e) method of Queue Interface inserts the specified element into this queue if it is possible to do so immediately without violating capacity restrictions.
//        System.out.println(toDo.size() + " " + toDo.poll());//This method returns the element at the front of the container or the head of the Queue. It returns null when the Queue is empty.
//        System.out.println(" " + toDo.peek() + " " + toDo.poll());//The peek() method of Queue Interface returns the element at the front the container.
//        System.out.println(" " + toDo.poll() + " " + toDo.poll());

        /*
        4 bills
        bills bills
        dishes laundry
         */

        //2.
        try{
            System.out.println(doStuff(args));
        }catch (Exception e ){
            System.out.println("exc");
        }
        doStuff(args);//unchecked Exception


    }
    static int doStuff(String[] args){
      return  Integer.parseInt(args[0]);//convert String into Integer
    }
}
