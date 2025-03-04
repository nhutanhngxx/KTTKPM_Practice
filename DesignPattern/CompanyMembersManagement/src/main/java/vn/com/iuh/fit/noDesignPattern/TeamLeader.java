package vn.com.iuh.fit.noDesignPattern;

public class TeamLeader extends Employee {
    public TeamLeader(String name) {
        super(name, "Đội Trưởng");
    }

    @Override
    public void showDuties() {
        System.out.println(name + " (" + position + ") công việc:");
        System.out.println("- Đi tuần");
        System.out.println("- Sắp xếp công việc cho nhân viên");
    }
}
