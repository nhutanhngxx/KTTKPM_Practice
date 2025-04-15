package vn.com.iuh.fit.Services;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import vn.com.iuh.fit.DTO.PaymentRequest;
import vn.com.iuh.fit.Models.Payment;
import vn.com.iuh.fit.Repositories.PaymentRepository;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class PaymentService {

    @Autowired
    private final PaymentRepository repository;

    public List<Payment> getAllPayments() {
        return repository.findAll();
    }

    public Payment getPaymentById(Long id) {
        return repository.findById(id).orElseThrow();
    }

    public Payment createPayment(Payment payment) {
        return repository.save(payment);
    }

    public void deletePayment(Long id) {
        repository.deleteById(id);
    }
}