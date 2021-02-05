package day44_Inheritance.WebdriverTask;

public class FireFoxDriver extends WebDriver {

    public FireFoxDriver(){
        super("FireFox Browser", "V83.0.0");
    }

    @Override
    public void get(String URL) {
        System.out.println("Opening " + URL + " from firefox driver");
    }

    @Override
    public void close() {
        System.out.println("Closing firefox driver");
    }

    @Override
    public void maximize() {
        System.out.println("Maximizing firefox driver");
    }
}
