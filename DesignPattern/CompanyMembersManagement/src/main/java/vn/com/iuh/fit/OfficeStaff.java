package vn.com.iuh.fit;

public class OfficeStaff extends Employee {
    public OfficeStaff(String name) {
        super(name, "Nhân viên VP");
    }

    @Override
    public void showDuties() {
        System.out.println(name + " (" + position + ") công việc:");
        System.out.println("Pha cà phê");
        System.out.println("Phê duyệt giấy tờ");
    }
}
