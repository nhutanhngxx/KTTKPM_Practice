package vn.com.iuh.fit.Controllers;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import vn.com.iuh.fit.Models.Shipping;
import vn.com.iuh.fit.Services.ShippingService;

import java.util.List;

@RestController
@RequestMapping("/shippings")
@RequiredArgsConstructor
public class ShippingController {

    private final ShippingService service;

    @GetMapping
    public List<Shipping> getAllShippings() {
        return service.getAllShippings();
    }

    @GetMapping("/{id}")
    public Shipping getShippingById(@PathVariable Long id) {
        return service.getShippingById(id);
    }

    @PostMapping
    public Shipping createShipping(@RequestBody Shipping shipping) {
        return service.createShipping(shipping);
    }

    @DeleteMapping("/{id}")
    public void deleteShipping(@PathVariable Long id) {
        service.deleteShipping(id);
    }
}