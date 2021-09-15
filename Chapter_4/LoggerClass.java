package Java_8_Lambdas.Chapter_4;


import com.sun.org.slf4j.internal.Logger;

public class LoggerClass {
    public static void main(String[] args) {
        Logger logger = new Logger("sdsafdaf");
        if (logger.isDebugEnabled()) {
            logger.debug("Look at this: " + expensiveOperation());
        }


//        Logger logger1 = new Logger("dfhd");
//        logger1.debug(() -> "Look at this: " + expensiveOperation());
    }


    private static String expensiveOperation() {
        return "adsfa";
    }
}
