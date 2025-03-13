package vn.com.iuh.fit;

import java.util.ArrayList;
import java.util.List;

/**
 * Class Composite - Một bàn chứa nhiều sản phẩm
 */

public class TableComposite implements BillableComponent {

    private int tableNumber;
    private List<BillableComponent> items = new ArrayList<>();

    public TableComposite(int tableNumber) {
        this.tableNumber = tableNumber;
    }

    public void addItem(BillableComponent item) {
        items.add(item);
    }

    @Override
    public double getTotalPrice() {
        return items.stream().mapToDouble(BillableComponent::getTotalPrice).sum();
    }
    @Override
    public String toString() {
        return "Bàn " + tableNumber + " - Tổng tiền: " + getTotalPrice() + " VND";
    }

}
