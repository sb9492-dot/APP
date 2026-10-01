package bankingapplication;

public class BankingApp {
    public static void main(String[] args) {
        Runnable transactionProcessing = new Runnable() {
            @Override
            public void run() {
                Thread.currentThread().setName("TransactionThread");
                for (int count = 1; count <= 3; count++) {
                    System.out.println("Thread: " + Thread.currentThread().getName()
                            + " -> Processing transaction " + count);
                    try {
                        Thread.sleep(500);
                    } catch (InterruptedException e) {
                        System.out.println("Transaction thread interrupted");
                    }
                }
            }
        };

        Runnable balanceUpdating = new Runnable() {
            @Override
            public void run() {
                Thread.currentThread().setName("BalanceThread");
                for (int count = 1; count <= 3; count++) {
                    System.out.println("Thread: " + Thread.currentThread().getName()
                            + " -> Updating balance " + count);
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        System.out.println("Balance thread interrupted");
                    }
                }
            }
        };

        Runnable smsNotification = new Runnable() {
            @Override
            public void run() {
                Thread.currentThread().setName("SMSNotificationThread");
                for (int count = 1; count <= 3; count++) {
                    System.out.println("Thread: " + Thread.currentThread().getName()
                            + " -> Sending SMS notification " + count);
                    try {
                        Thread.sleep(1500);
                    } catch (InterruptedException e) {
                        System.out.println("SMS thread interrupted");
                    }
                }
            }
        };

        Thread transaction = new Thread(transactionProcessing);
        Thread balance = new Thread(balanceUpdating);
        Thread sms = new Thread(smsNotification);

        transaction.start();
        balance.start();
        sms.start();
    }
}