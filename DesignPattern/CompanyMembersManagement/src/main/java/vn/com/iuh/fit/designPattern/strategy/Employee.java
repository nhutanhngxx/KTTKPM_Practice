package vn.com.iuh.fit.designPattern.strategy;

public class Employee {
    private String name;
    private EmployeeStrategy strategy;

    public Employee(String name, EmployeeStrategy strategy) {
        this.name = name;
        this.strategy = strategy;
    }

    public void setStrategy(EmployeeStrategy strategy) {
        this.strategy = strategy;
    }

    public void showDuties() {
        strategy.showDuties(name);
    }
}