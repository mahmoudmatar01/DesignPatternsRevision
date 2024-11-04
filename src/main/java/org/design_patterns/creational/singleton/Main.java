package org.design_patterns.creational.singleton;

public class Main {

    public static void main(String []args){
        Logger logger = Logger.getInstance();
        logger.logError("Something went error !!!!!");
        logger.logInfo("Hello, World !");
        logger.logWarn("Watch out!!!!");
    }
}
