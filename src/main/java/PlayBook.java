

import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;



public class PlayBook {
    static Logger logger = LogManager.getLogger();
    public static void main(String[] argv){
        logger.log(Level.INFO, "Testing is going well.");
        logger.error("Temperature is too high.");

        CounterPrime ctp1 = new CounterPrime(300, 545);
        Thread a = new Thread(ctp1);
        a.start();
        logger.error("Ending Main-thread execution.");

    }
}
