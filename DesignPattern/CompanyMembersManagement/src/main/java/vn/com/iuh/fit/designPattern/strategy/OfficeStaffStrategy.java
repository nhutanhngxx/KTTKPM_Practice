package vn.com.iuh.fit.designPattern.strategy;

public class OfficeStaffStrategy implements EmployeeStrategy {
    @Override
    public void showDuties(String name) {
        System.out.println(name + " (Nhân viên VP) công việc:");
        System.out.println("- Pha cà phê");
        System.out.println("- Phê duyệt giấy tờ");
    }
}
