/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package demo;
import java.net.MalformedURLException;


public class App {
    public void getGreeting() throws InterruptedException, MalformedURLException {
  
        bookMyShowLink link = new bookMyShowLink();
        //TODO: call your test case functions one after other here
        link.testCase01();
        //END Tests
        link.endTest();
    }

    public static void main(String[] args) throws InterruptedException, MalformedURLException {
        new App().getGreeting();
    }
}
