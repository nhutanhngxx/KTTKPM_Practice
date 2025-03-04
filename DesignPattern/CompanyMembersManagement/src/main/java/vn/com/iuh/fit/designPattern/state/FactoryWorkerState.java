package vn.com.iuh.fit.designPattern.state;

class FactoryWorkerState implements EmployeeState {
    @Override
    public void showDuties(String name) {
        System.out.println(name + " (Nhân viên Xưởng) công việc:");
        System.out.println("- Sản xuất sản phẩm");
        System.out.println("- Kiểm tra chất lượng");
    }
}