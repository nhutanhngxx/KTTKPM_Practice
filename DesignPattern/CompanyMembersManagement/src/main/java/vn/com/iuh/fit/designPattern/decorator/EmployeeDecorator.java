package vn.com.iuh.fit.designPattern.decorator;

import vn.com.iuh.fit.designPattern.strategy.EmployeeStrategy;

public abstract class EmployeeDecorator implements EmployeeStrategy {
    protected EmployeeStrategy decoratedEmployee;

    public EmployeeDecorator(EmployeeStrategy decoratedEmployee) {
        this.decoratedEmployee = decoratedEmployee;
    }

    @Override
    public void showDuties(String name) {
        decoratedEmployee.showDuties(name);
    }
}
