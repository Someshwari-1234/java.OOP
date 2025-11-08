public class OrderService {
    public static void main(String[] args) {

        // Functional Interface implemented using Lambda
        OrderProcessor processor = (orderId) -> {
            System.out.println("Order " + orderId + " has been successfully processed.");
            System.out.println("Email Notification Sent Successfully!");
        };

        // Call method
        processor.processOrder("ORD12345");
    }
}
