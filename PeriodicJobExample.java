class PeriodicJob implements Runnable {
    private final int interval;

    public PeriodicJob(int interval) {
        this.interval = interval;
    }

    @Override
    public void run() {
        while (true) {
            try {
                System.out.println("Periodic task running at: " + System.currentTimeMillis());
                Thread.sleep(interval);
            } catch (InterruptedException e) {
                System.out.println("Task interrupted.");
                break;
            }
        }
    }
}

// Main class
public class PeriodicJobExample {
    public static void main(String[] args) {

        Thread periodicThread = new Thread(new PeriodicJob(2000));
        periodicThread.start();

        System.out.println("Main thread continues its work...");

        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            System.out.println("Main thread interrupted.");
        }

        periodicThread.interrupt();
        System.out.println("Main thread finishes execution.");
    }
}
