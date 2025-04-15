package vn.com.iuh.fit.Controllers;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import vn.com.iuh.fit.Models.Inventory;
import vn.com.iuh.fit.Services.InventoryService;

import java.util.List;

@RestController
@RequestMapping("/inventories")
@RequiredArgsConstructor
public class InventoryController {

    private final InventoryService service;

    @GetMapping
    public List<Inventory> getAllInventories() {
        return service.getAllInventories();
    }

    @GetMapping("/{id}")
    public Inventory getInventoryById(@PathVariable Long id) {
        return service.getInventoryById(id);
    }

    @PostMapping
    public Inventory createInventory(@RequestBody Inventory inventory) {
        return service.createInventory(inventory);
    }

    @DeleteMapping("/{id}")
    public void deleteInventory(@PathVariable Long id) {
        service.deleteInventory(id);
    }
}