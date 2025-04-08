package vn.com.iuh.fit.Services;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import vn.com.iuh.fit.Models.Order;
import vn.com.iuh.fit.Repositories.OrderRepository;

import java.time.LocalDateTime;
import java.util.List;

@Service
@RequiredArgsConstructor
public class OrderService {

    private final OrderRepository repository;

    @Autowired
    private RestTemplate restTemplate;
    @Autowired
    private OrderRepository orderRepository;

    public boolean isCustomerExist(Long customerId) {
        try {
            restTemplate.getForObject("http://localhost:8081/customers/" + customerId, Object.class);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public Order createOrder(Order order) {
        if (!isCustomerExist(order.getCustomerId())) {
            throw new RuntimeException("Customer not found!");
        }

        order.setOrderDate(LocalDateTime.now());
        order.setStatus("CREATED");
        return orderRepository.save(order);
    }

    public List<Order> getAllOrders() {
        return repository.findAll();
    }

    public Order getOrderById(Long id) {
        return repository.findById(id).orElseThrow();
    }

    public void cancelOrder(Long id) {
        Order order = getOrderById(id);
        order.setStatus("CANCELLED");
        repository.save(order);
    }
}
