package vn.com.iuh.fit.designPattern.strategy;

public class DirectorStrategy implements EmployeeStrategy {
    @Override
    public void showDuties(String name) {
        System.out.println(name + " (Giám đốc) công việc:");
        System.out.println("- Quản lý toàn bộ công ty");
        System.out.println("- Ra quyết định chiến lược");
    }
}
