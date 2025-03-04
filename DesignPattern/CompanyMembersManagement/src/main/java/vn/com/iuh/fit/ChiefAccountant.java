package vn.com.iuh.fit;

class ChiefAccountant extends Employee {
    public ChiefAccountant(String name) {
        super(name, "Kế Toán Trưởng");
    }

    @Override
    public void showDuties() {
        System.out.println(name + " (" + position + ") công việc:");
        System.out.println("- Quản lý tài chính");
        System.out.println("- Lập báo cáo tài chính");
    }
}
