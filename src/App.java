import util.SessionFactoryConfiguration;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        SessionFactoryConfiguration.getInstance().getSession();
    }
}
