package vn.com.iuh.fit.designPattern.state;

/**
 * Lớp Employee có thể thay đổi trạng thái
 */

public class Employee {
    private String name;
    private EmployeeState state;

    public Employee(String name, EmployeeState state) {
        this.name = name;
        this.state = state;
    }

    public void setState(EmployeeState state) {
        this.state = state;
    }

    public void showDuties() {
        state.showDuties(name);
    }
}
