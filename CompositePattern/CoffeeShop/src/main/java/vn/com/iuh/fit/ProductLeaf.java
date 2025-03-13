package vn.com.iuh.fit;

/**
 * Class Leaf - Sản phẩm đơn lẻ
 */

public class ProductLeaf implements BillableComponent {

    private String name;
    private double price;

    public ProductLeaf(String name, double price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public String toString() {
        return name + " - " + price + " VND";
    }

    @Override
    public double getTotalPrice() {
        return price;
    }
}
