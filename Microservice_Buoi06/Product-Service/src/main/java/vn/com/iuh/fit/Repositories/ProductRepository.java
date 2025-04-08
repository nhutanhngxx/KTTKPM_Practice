package vn.com.iuh.fit.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import vn.com.iuh.fit.models.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
