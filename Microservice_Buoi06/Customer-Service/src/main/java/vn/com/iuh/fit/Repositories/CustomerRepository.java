package vn.com.iuh.fit.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import vn.com.iuh.fit.Models.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Long> {
}
