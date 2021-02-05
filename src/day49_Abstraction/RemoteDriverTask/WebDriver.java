package day49_Abstraction.RemoteDriverTask;

import java.net.URL;

public interface WebDriver {

    void get(String URL);
    void close();
    void quit();



}
