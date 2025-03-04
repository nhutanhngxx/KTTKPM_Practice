package vn.com.iuh.fit.noDesignPattern;

public class Director extends Employee {
    public Director(String name) {
        super(name, "Giám đốc");
    }

    @Override
    public void showDuties() {
        System.out.println(name + " (" + position + ") công việc:");
        System.out.println("- Quản lý toàn bộ công ty");
        System.out.println("- Ra quyết định chiến lược");
    }
}
