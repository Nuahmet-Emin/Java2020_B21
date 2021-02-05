package day44_Inheritance.WebdriverTask;

public class Test {
    public static void main(String[] args) {

        // ChromeDriver driver  = new ChromeDriver();
        // FireFoxDriver driver = new FireFoxDriver();
        CybertekDriver driver = new CybertekDriver();
        driver.get("apple.com");
        driver.maximize();
        driver.close();



    }
}
