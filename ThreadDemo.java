public class ThreadDemo {
    public static void main(String[] args) {
        Thread t = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Thread running using Anonymous Class");
            }
        });

        t.start();
    }
}
