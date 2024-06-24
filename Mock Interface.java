// ProductRepository.java
public interface ProductRepository {
    List<Product> findAll();
    Product findById(String id);
}

// InMemoryProductRepository.java
public class InMemoryProductRepository implements ProductRepository {
    private Map<String, Product> products = new HashMap<>();

    @Override
    public List<Product> findAll() {
        return new ArrayList<>(products.values());
    }

    @Override
    public Product findById(String id) {
        return products.get(id);
    }
}
