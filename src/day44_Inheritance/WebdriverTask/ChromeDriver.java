package day44_Inheritance.WebdriverTask;

public class ChromeDriver extends WebDriver {

    public ChromeDriver() {
        super("Chrome Browser", "V84.0.1");
    }

    @Override
    public void get(String URL) {
        System.out.println("Opening " + URL + " with the chrome driver");
    }

    @Override
    public void close() {
        System.out.println("Closing chrome driver");
    }

    @Override
    public void maximize() {
        System.out.println("Maximizing the chrome driver");
    }
}
