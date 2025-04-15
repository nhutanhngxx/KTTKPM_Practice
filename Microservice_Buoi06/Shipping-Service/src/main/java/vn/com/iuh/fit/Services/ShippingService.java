package vn.com.iuh.fit.Services;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import vn.com.iuh.fit.Models.Shipping;
import vn.com.iuh.fit.Repositories.ShippingRepository;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ShippingService {

    private final ShippingRepository repository;

    public List<Shipping> getAllShippings() {
        return repository.findAll();
    }

    public Shipping getShippingById(Long id) {
        return repository.findById(id).orElseThrow();
    }

    public Shipping createShipping(Shipping shipping) {
        return repository.save(shipping);
    }

    public void deleteShipping(Long id) {
        repository.deleteById(id);
    }
}