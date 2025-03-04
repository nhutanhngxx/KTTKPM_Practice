package vn.com.iuh.fit.designPattern.state;

class DirectorState implements EmployeeState {
    @Override
    public void showDuties(String name) {
        System.out.println(name + " (Giám đốc) công việc:");
        System.out.println("- Quản lý toàn bộ công ty");
        System.out.println("- Ra quyết định chiến lược");
    }
}