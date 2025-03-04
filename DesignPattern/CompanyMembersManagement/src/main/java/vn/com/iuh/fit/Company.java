package vn.com.iuh.fit;

import java.util.Scanner;

public class Company {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhập tên nhân viên:");
        String name = scanner.nextLine();

        System.out.println("Chọn chức vụ: \n1. Đội Trưởng \n2. Giám đốc \n3. Nhân viên VP \n4. Nhân viên Xưởng \n5. Kế Toán Trưởng");
        int choice = scanner.nextInt();

        Employee employee;
        switch (choice) {
            case 1:
                employee = new TeamLeader(name);
                break;
            case 2:
                employee = new Director(name);
                break;
            case 3:
                employee = new OfficeStaff(name);
                break;
            case 4:
                employee = new FactoryWorker(name);
                break;
            case 5:
                employee = new ChiefAccountant(name);
                break;
            default:
                System.out.println("Chức vụ không hợp lệ!");
                return;
        }

        employee.showDuties();
    }
}
