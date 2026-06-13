public class Logger {
    private static final Logger INSTANCE = new Logger();
    private Logger() {}

    public static Logger getInstance() {
        return INSTANCE;
    }
    public void log(String msg){
        System.out.println("Log: "+msg);
    }
    public void logWarning(String msg){
        System.out.println("Log Warning: "+msg);
    }
    public void logError(String msg){
        System.out.println("LogError: "+msg);
    }

}
