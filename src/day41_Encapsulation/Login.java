package day41_Encapsulation;

public class Login {
    public static void main(String[] args) {
        
        Credentials obj = new Credentials();

        System.out.println(obj.getUserName());
        System.out.println(obj.getPassWord());

        // obj.getPassWord()= 1234; Read Only

        // obj.userName = "HI";

        obj.setUserName("Hello");
        System.out.println(obj.getUserName());

        System.out.println(obj.getPassWord());
        obj.setPassWord(2345);
        System.out.println(obj.getPassWord());
        

        
        
    }
}
