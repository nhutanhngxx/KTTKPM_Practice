package vn.com.iuh.fit;

import java.util.ArrayList;
import java.util.List;

public class Classroom {

    private String className;
    private Monitor monitor;
    private List<Student> students = new ArrayList<>();

    public Classroom(String className, Monitor monitor) {
        this.className = className;
        this.monitor = monitor;
    }

    public void addStudent(Student student) {
        students.add(student);
        monitor.attach(student);
    }

    public void removeStudent(Student student) {
        students.remove(student);
        monitor.detach(student);
    }

    public void notifyStudents(String message) {
        System.out.println("Notifications: Lớp " + className + " nhận thông báo: " + message);
        monitor.setNotification(message);
    }
}
