package vn.com.iuh.fit.designPattern.state;

import java.util.Scanner;

public class Company {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhập tên nhân viên:");
        String name = scanner.nextLine();

        System.out.println("Chọn chức vụ: \n1. Đội Trưởng \n2. Giám đốc \n3. Nhân viên VP \n4. Nhân viên Xưởng \n5. Kế Toán Trưởng");
        int choice = scanner.nextInt();

        Employee employee = EmployeeFactory.createEmployee(choice, name);
        if (employee != null) {
            employee.showDuties();
        } else {
            System.out.println("Chức vụ không hợp lệ!");
        }
    }
}