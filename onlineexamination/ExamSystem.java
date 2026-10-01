package onlineexamination;

public class ExamSystem {
    public static void main(String[] args) {
        Runnable remainingTime = new Runnable() {
            @Override
            public void run() {
                Thread.currentThread().setName("TimerThread");
                for (int i = 1; i <= 3; i++) {
                    System.out.println("Thread: " + Thread.currentThread().getName() + " -> Displaying remaining time: " + i + " minute(s) left");
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        System.out.println("Timer thread interrupted");
                    }
                }
            }
        };

        Runnable autoSave = new Runnable() {
            @Override
            public void run() {
                Thread.currentThread().setName("AutoSaveThread");
                for (int i = 1; i <= 3; i++) {
                    System.out.println("Thread: " + Thread.currentThread().getName() + " -> Auto-saving answers... " + i);
                    try {
                        Thread.sleep(1500);
                    } catch (InterruptedException e) {
                        System.out.println("Auto-save thread interrupted");
                    }
                }
            }
        };

        Runnable networkCheck = new Runnable() {
            @Override
            public void run() {
                Thread.currentThread().setName("NetworkThread");
                for (int i = 1; i <= 3; i++) {
                    System.out.println("Thread: " + Thread.currentThread().getName() + " -> Checking network connection... " + i);
                    try {
                        Thread.sleep(2000);
                    } catch (InterruptedException e) {
                        System.out.println("Network thread interrupted");
                    }
                }
            }
        };

        Thread timer = new Thread(remainingTime);
        Thread saver = new Thread(autoSave);
        Thread network = new Thread(networkCheck);

        timer.start();
        saver.start();
        network.start();
    }
}