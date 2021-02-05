package day49_Abstraction.RemoteDriverTask;

public class FireFoxDriver extends RemoteDriver{
    @Override
    public void executeScript(String script) {
        System.out.println("Script " + script + " is executed on firefox");
    }

    @Override
    public void TakeScreenShot(String name) {
        System.out.println("Taking screenshot on firefox");
    }

    @Override
    public void get(String URL) {
        System.out.println("Navigating to " + URL);
    }

    @Override
    public void close() {
        System.out.println("Closing firefox browser");
    }

    @Override
    public void quit() {
        System.out.println("Quitting firefox browser");
    }
}
