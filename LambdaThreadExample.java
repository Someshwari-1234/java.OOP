public class LambdaThreadExample {
    public static void main(String[] args) {
        Thread t = new Thread(() -> {
            System.out.println("Thread is running using Lambda!");
        });

        t.start();
    }
}
