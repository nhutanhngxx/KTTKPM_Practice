package vn.com.iuh.fit.designPattern.decorator;

import vn.com.iuh.fit.designPattern.strategy.EmployeeStrategy;

public class SpecialTaskDecorator extends EmployeeDecorator {
    public SpecialTaskDecorator(EmployeeStrategy decoratedEmployee) {
        super(decoratedEmployee);
    }

    @Override
    public void showDuties(String name) {
        super.showDuties(name);
        System.out.println("- Được giao nhiệm vụ đặc biệt");
    }
}