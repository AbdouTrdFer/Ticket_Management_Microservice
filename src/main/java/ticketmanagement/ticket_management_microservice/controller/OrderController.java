package ticketmanagement.ticket_management_microservice.controller;

import org.springframework.web.bind.annotation.*;
import ticketmanagement.ticket_management_microservice.model.Order;
import ticketmanagement.ticket_management_microservice.service.OrderService;

import java.util.List;

@RestController
@RequestMapping("/api/orders")
@CrossOrigin(origins = "*")  // permet de tester avec front séparé
public class OrderController {

    private final OrderService service;

    public OrderController(OrderService service) {
        this.service = service;
    }

    @GetMapping
    public List<Order> getOrders() {
        return service.getAllOrders();
    }

    @PostMapping
    public Order createOrder(@RequestBody Order order) {
        return service.createOrder(order);
    }
}