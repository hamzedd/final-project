// ProductService.java
public class ProductService {
    private ProductRepository productRepository;

    public List<Product> browseBooks() {
        return productRepository.findAll();
    }

    public Product viewBookDetails(String productId) {
        return productRepository.findById(productId);
    }
}

// OrderService.java
public class OrderService {
    private OrderRepository orderRepository;
    private PaymentService paymentService;
    private InventoryService inventoryService;

    public Order checkout(Order order) {
        paymentService.processPayment(order.getTotal());
        inventoryService.updateStock(order.getItems());
        return orderRepository.save(order);
    }
}
