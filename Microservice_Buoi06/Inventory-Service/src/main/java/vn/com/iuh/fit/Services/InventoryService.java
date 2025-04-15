package vn.com.iuh.fit.Services;


import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import vn.com.iuh.fit.Models.Inventory;
import vn.com.iuh.fit.Repositories.InventoryRepository;

import java.util.List;

@Service
@RequiredArgsConstructor
public class InventoryService {

    private final InventoryRepository repository;

    public List<Inventory> getAllInventories() {
        return repository.findAll();
    }

    public Inventory getInventoryById(Long id) {
        return repository.findById(id).orElseThrow();
    }

    public Inventory createInventory(Inventory inventory) {
        return repository.save(inventory);
    }

    public void deleteInventory(Long id) {
        repository.deleteById(id);
    }
}