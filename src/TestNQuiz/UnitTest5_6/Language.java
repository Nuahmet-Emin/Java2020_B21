package TestNQuiz.UnitTest5_6;

public class Language {
    public void method(){
        System.out.println("0");

    }

}

 class Java extends Language{
    @Override
    public void method(){
        System.out.println("1");
    }
}

class Selenium extends Java{
    @Override
    public void method() {
        System.out.println("2");
    }
}

 class Main{

}
