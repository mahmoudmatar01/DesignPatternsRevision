package org.design_patterns.creational.singleton;

public class Logger {

    private LogLevel logLevel;
    private static Logger instance;

    private Logger(){}

    public void setLogLevel(LogLevel logLevel) {
        this.logLevel = logLevel;
    }

    public void logError(String message) {
        setLogLevel(LogLevel.ERROR);
        if (logLevel.ordinal() <= LogLevel.ERROR.ordinal())
            System.out.println("ERROR: " + message + " with type "+ logLevel);
    }

    public void logWarn(String message) {
        setLogLevel(LogLevel.WARN);
        if (logLevel.ordinal() <= LogLevel.WARN.ordinal())
            System.out.println("Warn: " + message + " with type "+ logLevel);
    }

    public void logInfo(String message) {
        setLogLevel(LogLevel.INFO);
        if (logLevel.ordinal() <= LogLevel.INFO.ordinal())
            System.out.println("Info: " + message + " with type "+ logLevel);
    }

    public static Logger getInstance(){
        if(instance==null){
            synchronized (Logger.class){
                if(instance==null){
                    instance = new Logger();
                }
            }
        }
        return instance;
    }
}
