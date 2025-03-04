package vn.com.iuh.fit.designPattern.strategy;

public class EmployeeFactory {
    public static Employee createEmployee(int choice, String name) {
        return switch (choice) {
            case 1 -> new Employee(name, new TeamLeaderStrategy());
            case 2 -> new Employee(name, new DirectorStrategy());
            case 3 -> new Employee(name, new OfficeStaffStrategy());
            case 4 -> new Employee(name, new FactoryWorkerStrategy());
            case 5 -> new Employee(name, new ChiefAccountantStrategy());
            default -> null;
        };
    }
}
