// MockPresentation.java
public class MockPresentation {
    private ProductService productService;
    private OrderService orderService;

    public void run() {
        List<Product> products = productService.browseBooks();
        products.forEach(product -> System.out.println(product.getName()));

        Product product = productService.viewBookDetails("1");
        System.out.println("Selected product: " + product.getName());

        Order order = new Order();
        order.addItem(new OrderItem(product, 1));
        orderService.checkout(order);
    }

    public static void main(String[] args) {
        new MockPresentation().run();
    }
}
