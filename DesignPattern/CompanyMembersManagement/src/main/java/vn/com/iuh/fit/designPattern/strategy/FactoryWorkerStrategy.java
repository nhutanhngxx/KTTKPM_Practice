package vn.com.iuh.fit.designPattern.strategy;

public class FactoryWorkerStrategy implements EmployeeStrategy {
    @Override
    public void showDuties(String name) {
        System.out.println(name + " (Nhân viên Xưởng) công việc:");
        System.out.println("- Sản xuất sản phẩm");
        System.out.println("- Kiểm tra chất lượng");
    }
}
