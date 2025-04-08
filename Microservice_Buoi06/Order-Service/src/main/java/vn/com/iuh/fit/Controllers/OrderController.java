package vn.com.iuh.fit.Controllers;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import vn.com.iuh.fit.Models.Order;
import vn.com.iuh.fit.Services.OrderService;

import java.util.List;

@RestController
@RequestMapping("/orders")
@RequiredArgsConstructor
public class OrderController {

    private final OrderService service;

    @GetMapping
    public List<Order> getAll() {
        return service.getAllOrders();
    }

    @GetMapping("/{id}")
    public Order getById(@PathVariable Long id) {
        return service.getOrderById(id);
    }

    @PostMapping
    public Order create(@RequestBody Order order) {
        return service.createOrder(order);
    }

    @PostMapping("/{id}/cancel")
    public void cancel(@PathVariable Long id) {
        service.cancelOrder(id);
    }
}
