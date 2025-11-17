public class DaemonDemo extends Thread {
    public void run() {
        if (isDaemon())
            System.out.println("Daemon thread running");
        else
            System.out.println("User thread running");
    }

    public static void main(String[] args) {
        DaemonDemo t = new DaemonDemo();
        t.setDaemon(true);  // Must set before start()

        t.start();
    }
}
