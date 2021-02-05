package day44_Inheritance;

class Q{

    public final void method(){
        System.out.println("Method A");
    }

    public final void method(int a){
        System.out.println("Method A" + a);
    }

}

public class FinalKeyWord extends Q{
    /*@Override
    public void method(){
        System.out.println("Method B");
    }*/

    public final static int z = 200; // need to be initialized

    public static void main(String[] args) {

        System.out.println(z);
        //z = 300; can not be re-assigned
    }
}

class Z {

}
