package vn.com.iuh.fit.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import vn.com.iuh.fit.Models.Shipping;

public interface ShippingRepository extends JpaRepository<Shipping, Long> {
}
