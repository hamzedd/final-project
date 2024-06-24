// Customer.java
public class Customer {
    private String id;
    private String name;
    private List<Order> orders;

    // Getters, setters, and constructors
}

// Product.java
public class Product {
    private String id;
    private String name;
    private Money price;

    // Getters, setters, and constructors
}

// Order.java
public class Order {
    private String id;
    private List<OrderItem> items;
    private Money total;

    // Getters, setters, and constructors
}

// Money.java
public class Money {
    private BigDecimal amount;
    private String currency;

    // Getters, setters, and constructors
}
