package vn.com.iuh.fit;

public class CoffeeShopApp {
    public static void main(String[] args) {
        ProductLeaf coffee = new ProductLeaf("Ca Phe", 25000);
        ProductLeaf tea = new ProductLeaf("Tra", 15000);
        ProductLeaf water = new ProductLeaf("Nuoc suoi", 10000);

        TableComposite table1 = new TableComposite(1);
        table1.addItem(coffee);
        table1.addItem(water);

        TableComposite table2 = new TableComposite(2);
        table2.addItem(water);
        table2.addItem(tea);

        CoffeeShopComposite coffeeShop = new CoffeeShopComposite();
        coffeeShop.addTable(table1);
        coffeeShop.addTable(table2);

        System.out.println(table1);
        System.out.println(table2);
        System.out.println(coffeeShop);
    }
}
