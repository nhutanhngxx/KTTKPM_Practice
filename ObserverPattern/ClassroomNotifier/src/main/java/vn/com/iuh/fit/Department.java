package vn.com.iuh.fit;

import java.util.ArrayList;
import java.util.List;

public class Department {

    private String name;
    private List<Classroom> classes = new ArrayList<>();

    public Department(String name) {
        this.name = name;
    }

    public void addClassroom(Classroom classroom) {
        classes.add(classroom);
    }

    public void notifyAllClasses(String message) {
        System.out.println("Notifications: Khoa " + name + " gửi thông báo: " + message);
        for (Classroom classroom : classes) {
            classroom.notifyStudents(message);
        }
    }

}
