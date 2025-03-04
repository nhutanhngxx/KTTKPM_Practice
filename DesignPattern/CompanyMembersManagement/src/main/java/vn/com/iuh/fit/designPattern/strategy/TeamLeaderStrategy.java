package vn.com.iuh.fit.designPattern.strategy;

public class TeamLeaderStrategy implements EmployeeStrategy {
    @Override
    public void showDuties(String name) {
        System.out.println(name + " (Đội Trưởng) công việc:");
        System.out.println("- Đi tuần");
        System.out.println("- Gán việc cho nhân viên");
    }
}
