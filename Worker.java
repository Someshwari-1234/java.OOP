public class Worker extends Thread {
    public void run() {
        for (int i = 1; i <= 3; i++) {
            System.out.println(Thread.currentThread().getName() + " - Task " + i);
        }
    }

    public static void main(String[] args) {
        Worker t1 = new Worker();
        Worker t2 = new Worker();
        Worker t3 = new Worker();

        t1.start();
        t2.start();
        t3.start();
    }
}
