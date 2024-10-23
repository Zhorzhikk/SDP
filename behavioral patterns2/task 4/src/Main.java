public class Main {
    public static void main(String[] args) {
        // Process a standard order
        OrderProcess standardOrder = new StandardOrderProcess(10);  // 10 km
        System.out.println("Processing Standard Order:");
        standardOrder.processOrder();

        System.out.println();

        // Process a VIP order
        OrderProcess vipOrder = new VIPOrderProcess(10);  // 10 km
        System.out.println("Processing VIP Order:");
        vipOrder.processOrder();
    }
}
