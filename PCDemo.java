public class Buffer {
    private int data;
    private boolean available = false;

    public synchronized void produce(int value) throws InterruptedException {
        while (available) {
            wait();     // wait until consumer consumes
        }
        data = value;
        System.out.println("Produced: " + data);
        available = true;
        notify();       // wake consumer
    }

    public synchronized int consume() throws InterruptedException {
        while (!available) {
            wait();     // wait until producer produces
        }
        System.out.println("Consumed: " + data);
        available = false;
        notify();       // wake producer
        return data;
    }
}

public class PCDemo {
    public static void main(String[] args) {
        Buffer buffer = new Buffer();

        Thread producer = new Thread(() -> {
            for (int i = 1; i <= 5; i++) {
                try {
                    buffer.produce(i);
                } catch (Exception e) {}
            }
        });

        Thread consumer = new Thread(() -> {
            for (int i = 1; i <= 5; i++) {
                try {
                    buffer.consume();
                } catch (Exception e) {}
            }
        });

        producer.start();
        consumer.start();
    }
}
