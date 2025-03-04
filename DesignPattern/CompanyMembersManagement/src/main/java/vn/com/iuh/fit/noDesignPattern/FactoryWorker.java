package vn.com.iuh.fit.noDesignPattern;

class FactoryWorker extends Employee {
    public FactoryWorker(String name) {
        super(name, "Nhân viên Xưởng");
    }

    @Override
    public void showDuties() {
        System.out.println(name + " (" + position + ") công việc:");
        System.out.println("- Sản xuất sản phẩm");
        System.out.println("- Kiểm tra chất lượng");
    }
}