public class MyTask implements Runnable {
    public void run() {
        System.out.println("Thread executed using Runnable: " + Thread.currentThread().getName());
    }

    public static void main(String[] args) {
        Thread t = new Thread(new MyTask());
        t.start();
    }
}
