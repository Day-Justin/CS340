public class ECThread implements Runnable{ // more modular b/c java allow any # of implements but only 1 extension
                                           // b/c java doesn't allow multiple inheritance

    private int threadNumber;
    public ECThread (int threadNumber){
        this.threadNumber = threadNumber;
    }

    @Override
    public void run() {
        for (int i = 1; i <= 5; i++){
            System.out.println(i + ": Thread " + threadNumber);

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
            }
        }
    }
}
