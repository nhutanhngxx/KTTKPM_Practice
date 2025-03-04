package vn.com.iuh.fit.designPattern.state;

class ChiefAccountantState implements EmployeeState {
    @Override
    public void showDuties(String name) {
        System.out.println(name + " (Kế Toán Trưởng) công việc:");
        System.out.println("- Quản lý tài chính");
        System.out.println("- Lập báo cáo tài chính");
    }
}
