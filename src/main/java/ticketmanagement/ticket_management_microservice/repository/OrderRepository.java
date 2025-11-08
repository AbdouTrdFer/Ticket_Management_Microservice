package ticketmanagement.ticket_management_microservice.repository;




import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ticketmanagement.ticket_management_microservice.model.Order;

@Repository
public interface OrderRepository extends JpaRepository<Order, Long> {
}
