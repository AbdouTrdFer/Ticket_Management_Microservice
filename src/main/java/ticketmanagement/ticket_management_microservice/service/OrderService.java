package ticketmanagement.ticket_management_microservice.service;

import org.springframework.stereotype.Service;
import ticketmanagement.ticket_management_microservice.model.Order;
import ticketmanagement.ticket_management_microservice.repository.OrderRepository;

import java.util.List;

@Service
public class OrderService {

    private final OrderRepository repository;

    public OrderService(OrderRepository repository) {
        this.repository = repository;
    }

    public List<Order> getAllOrders() {
        return repository.findAll();
    }

    public Order createOrder(Order order) {
        return repository.save(order);
    }
}