public class SingletonTest {
    public static void main(String[] args) {

        Logger logger1 = Logger.getInstance();
        Logger logger2 = Logger.getInstance();

        logger1.log("Application Started");
        logger2.logWarning("Low Memory");
        logger1.logError("Database Connection Failed");

        System.out.println("\nComparing Objects:");
        System.out.println("logger1 == logger2 : " + (logger1 == logger2));
    }
}