package vn.com.iuh.fit;

public class ObserverPatternDemo {
    public static void main(String[] args) {
        Department itDepartment = new Department("Công Nghệ Thông Tin");

        Monitor monitor1 = new Monitor();
        Monitor monitor2 = new Monitor();

        Classroom classA = new Classroom("DHKTPM17C", monitor1);
        Classroom classB = new Classroom("DHKTPM17B", monitor2);

        // Thêm 2 lớp vừa khởi tạo vào Khoa CNTT
        itDepartment.addClassroom(classA);
        itDepartment.addClassroom(classB);

        Student student1 = new Student("Nguyễn Nhựt Anh");
        Student student2 = new Student("Nguyễn Lê Nhật Huy");
        Student student3 = new Student("Nguyễn Thị Nga");
        Student student4 = new Student("Nguyễn Thành Cương");
        Student student5 = new Student("Đinh Nguyên Chung");

        classA.addStudent(student1);
        classA.addStudent(student2);
        classA.addStudent(student3);

        classB.addStudent(student4);
        classB.addStudent(student5);

        // Monitor gửi thông báo đến các lớp
        classA.notifyStudents("Ngày mai kiểm tra giữa kỳ!");
        classB.notifyStudents("Lớp nghỉ học vào thứ Sáu!");

        // Department gửi thông báo đến tất cả lớp
        itDepartment.notifyAllClasses("Hội thảo công nghệ sẽ diễn ra vào tuần sau!");
    }

}
