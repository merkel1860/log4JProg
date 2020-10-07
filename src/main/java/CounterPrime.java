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
    private int lowerSide;
    private int upperSide;

    public CounterPrime(int lowerSide, int upperSide) {
        this.lowerSide = lowerSide;
        this.upperSide = upperSide;
        primeList = new ArrayList<>();
    }

    @Override
    public void run() {

    }
}
