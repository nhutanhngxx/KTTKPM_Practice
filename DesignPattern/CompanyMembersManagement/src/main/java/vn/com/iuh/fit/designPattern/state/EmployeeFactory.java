package vn.com.iuh.fit.designPattern.state;

/**
 * Factory Pattern để tạo nhân viên với trạng thái
 */

class EmployeeFactory {
    public static Employee createEmployee(int choice, String name) {
        return switch (choice) {
            case 1 -> new Employee(name, new TeamLeaderState());
            case 2 -> new Employee(name, new DirectorState());
            case 3 -> new Employee(name, new OfficeStaffState());
            case 4 -> new Employee(name, new FactoryWorkerState());
            case 5 -> new Employee(name, new ChiefAccountantState());
            default -> null;
        };
    }
}
