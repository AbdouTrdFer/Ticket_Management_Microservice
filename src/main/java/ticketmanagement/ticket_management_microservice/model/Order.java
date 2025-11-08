package ticketmanagement.ticket_management_microservice.model;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "orders")
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String product;
    private int quantity;
    private double price;

    private LocalDateTime createdAt = LocalDateTime.now();

    // Constructors
    public Order() {}

    public Order(String productName, int quantity, double price, LocalDateTime orderDate) {
        this.product = productName;
        this.quantity = quantity;
        this.price = price;
        this.createdAt = orderDate;
    }

    // getters et setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getProduct() { return product; }
    public void setProduct(String product) { this.product = product; }

    public int getQuantity() { return quantity; }
    public void setQuantity(int quantity) { this.quantity = quantity; }

    public double getPrice() { return price; }
    public void setPrice(double price) { this.price = price; }

    public LocalDateTime getCreatedAt() { return createdAt; }
    public void setCreatedAt(LocalDateTime createdAt) { this.createdAt = createdAt; }
}
