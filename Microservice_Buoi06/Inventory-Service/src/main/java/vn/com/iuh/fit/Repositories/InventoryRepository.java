package vn.com.iuh.fit.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import vn.com.iuh.fit.Models.Inventory;

public interface InventoryRepository extends JpaRepository<Inventory, Long> {
}
