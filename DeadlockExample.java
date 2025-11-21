class Lock1 {}
class Lock2 {}

public class DeadlockExample {
    public static void main(String[] args) {
        final Lock1 l1 = new Lock1();
        final Lock2 l2 = new Lock2();

        Thread t1 = new Thread(() -> {
            synchronized (l1) {
                System.out.println("Thread 1 acquired Lock1");
                try { Thread.sleep(100); } catch (Exception e) {}
                synchronized (l2) {
                    System.out.println("Thread 1 acquired Lock2");
                }
            }
        });

        Thread t2 = new Thread(() -> {
            synchronized (l2) {
                System.out.println("Thread 2 acquired Lock2");
                try { Thread.sleep(100); } catch (Exception e) {}
                synchronized (l1) {
                    System.out.println("Thread 2 acquired Lock1");
                }
            }
        });

        t1.start();
        t2.start();
    }
}
