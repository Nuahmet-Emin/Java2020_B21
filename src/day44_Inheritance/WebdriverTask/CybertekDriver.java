package day44_Inheritance.WebdriverTask;

public class CybertekDriver extends WebDriver{

    public CybertekDriver(){
        super("Cybertek Browser", "V35.0.1");
    }

    @Override
    public void get(String URL) {
        System.out.println("Opening " + URL + " from Cybertek driver");
    }

    @Override
    public void close() {
        System.out.println("Closing cybertek driver" );;
    }

    @Override
    public void maximize() {
        System.out.println("Maximizing cybertek browser");
    }
}
