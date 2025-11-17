public class Job implements Runnable {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(Thread.currentThread().getName() + " → " + i);
        }
    }

    public static void main(String[] args) {
        Thread t1 = new Thread(new Job(), "Worker-1");
        Thread t2 = new Thread(new Job(), "Worker-2");

        t1.start();
        t2.start();
    }
}
