package day39_StaticBlock;

public class StaticBlocks2 {

    static{
        System.out.println("Static Block");
    }

    static{
        System.out.println("Static Block2");
    }

    static {
        System.out.println("Static Block 3");
    }

    public static void main(String[] args) {
        System.out.println("Main Method");
    }
}
