package smarttrafficmanagement;

class TrafficJunction extends Thread {
    private String status;
    private long delay;

    public TrafficJunction(String name, String status, long delay) {
        super(name);
        this.status = status;
        this.delay = delay;
    }

    @Override
    public void run() {
        for (int i = 1; i <= 3; i++) {
            System.out.println("Thread: " + getName() + " -> Traffic status at junction: " + status + " (Report " + i + ")");
            try {
                Thread.sleep(delay);
            } catch (InterruptedException e) {
                System.out.println(getName() + " interrupted");
            }
        }
    }
}

public class SmartTrafficManagement {
    public static void main(String[] args) {
        TrafficJunction junction1 = new TrafficJunction("JunctionA", "Heavy Traffic", 500);
        TrafficJunction junction2 = new TrafficJunction("JunctionB", "Moderate Traffic", 1000);
        TrafficJunction junction3 = new TrafficJunction("JunctionC", "Light Traffic", 1500);

        junction1.start();
        junction2.start();
        junction3.start();
    }
}