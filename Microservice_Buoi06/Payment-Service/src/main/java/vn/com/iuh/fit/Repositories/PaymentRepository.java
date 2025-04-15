package vn.com.iuh.fit.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import vn.com.iuh.fit.Models.Payment;

@Repository
public interface PaymentRepository extends JpaRepository<Payment, Long> {
}

