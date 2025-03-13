package vn.com.iuh.fit;

import java.util.ArrayList;
import java.util.List;

/**
 * Class Composite - Quán cà phê chứa nhiều bàn
 */

public class CoffeeShopComposite implements BillableComponent {

    private List<BillableComponent> tables = new ArrayList<>();

    public void addTable(BillableComponent table) {
        tables.add(table);
    }

    @Override
    public double getTotalPrice() {
        return tables.stream().mapToDouble(BillableComponent::getTotalPrice).sum();
    }

    @Override
    public String toString() {
        return "Doanh thu quán cà phê: " + getTotalPrice() + " VND";
    }
}
