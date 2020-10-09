import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.ArrayList;
import java.util.List;

public class CounterPrime implements Runnable{
    /**
     * When an object implementing interface <code>Runnable</code> is used
     * to create a thread, starting the thread causes the object's
     * <code>run</code> method to be called in that separately executing
     * thread.
     * <p>
     * The general contract of the method <code>run</code> is that it may
     * take any action whatsoever.
     *
     * @see Thread#run()
     */
    private List<Integer> primeList;
    private final int lowerSide;
    private final int upperSide;

    static Logger logger = LogManager.getLogger();

    public CounterPrime(int lowerSide, int upperSide) {
        this.lowerSide = lowerSide;
        this.upperSide = upperSide;
        primeList = new ArrayList<>();
    }
    public void searchPrimeFromInterval(){
        for (int i = lowerSide; i<=upperSide; i++){
            if (PrimeCheck.primeCheck(i)){
                primeList.add(i);
                logger.log(Level.INFO, "New prime number found, value :"+i);
            }
        }
    }

    @Override
    public void run() {
        searchPrimeFromInterval();
        System.out.println("From ["+lowerSide+","+upperSide+"] "
                +primeList.size()+" prime numbers"+
                (primeList.size()<=1? " is ":" are ")+"found");
    }
}
