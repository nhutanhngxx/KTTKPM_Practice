package vn.com.iuh.fit.designPattern.state;

class TeamLeaderState implements EmployeeState {
    @Override
    public void showDuties(String name) {
        System.out.println(name + " (Đội Trưởng) công việc:");
        System.out.println("- Đi tuần");
        System.out.println("- Gán việc cho nhân viên");
    }
}