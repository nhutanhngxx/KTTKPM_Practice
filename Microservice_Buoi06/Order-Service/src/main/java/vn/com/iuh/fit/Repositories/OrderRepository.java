package vn.com.iuh.fit.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import vn.com.iuh.fit.Models.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {
}